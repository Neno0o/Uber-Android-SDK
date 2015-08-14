package com.neno0o.ubersdk.Activites;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

import com.neno0o.ubersdk.Auth.Models.AccessToken;
import com.neno0o.ubersdk.R;
import com.neno0o.ubersdk.Uber;
import com.neno0o.ubersdk.UberURLs;

import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

/**
 * This is the authentication activity which implements a web view.
 * Returning to the application in onActivityResult with Uber instance.
 */
public class Authentication extends AppCompatActivity {

    // Getting intent from the application
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getWindow().requestFeature(Window.FEATURE_PROGRESS);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.authentication);

        WebView webView = (WebView) findViewById(R.id.web_view);
        webView.getSettings().setJavaScriptEnabled(true);

        webView.setWebChromeClient(new WebChromeClient() {
            public void onProgressChanged(WebView view, int progress) {
                Authentication.this.setProgress(progress * 1000);
            }
        });

        webView.setWebViewClient(new UberWebViewClient());

        webView.loadUrl(buildUrl());

        intent = new Intent();
    }


    private String buildUrl() {
        Uri.Builder uriBuilder = Uri.parse(UberURLs.AUTHORIZE_URL).buildUpon();
        uriBuilder.appendQueryParameter("response_type", Uber.getInstance().getResponeType());
        uriBuilder.appendQueryParameter("client_id", Uber.getInstance().getClientId());
        return uriBuilder.build().toString().replace("%20", "+");
    }

    private class UberWebViewClient extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            return checkRedirect(url);
        }

        @Override
        public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
            if (checkRedirect(failingUrl)) {
                return;
            }
            Toast.makeText(Authentication.this, "Error " + description, Toast.LENGTH_SHORT).show();
        }

        private boolean checkRedirect(String url) {
            if (url.startsWith(Uber.getInstance().getClientRedirectUri())) {
                Uri uri = Uri.parse(url);

                Uber.getInstance().getUberAuthService().getAuthToken(
                        Uber.getInstance().getClientSecret(),
                        Uber.getInstance().getClientId(),
                        Uber.getInstance().getGrantType(),
                        uri.getQueryParameter("code"),
                        Uber.getInstance().getClientRedirectUri(),
                        new Callback<AccessToken>() {
                            @Override
                            public void success(AccessToken accessToken, Response response) {
                                Uber.getInstance().setAccessToken(accessToken);
                                setResult(RESULT_OK, intent);
                                finish();
                            }

                            @Override
                            public void failure(RetrofitError error) {

                            }
                        }
                );
                return true;
            }
            return false;
        }
    }
}

