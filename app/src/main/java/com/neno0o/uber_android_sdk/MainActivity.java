package com.neno0o.uber_android_sdk;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.neno0o.ubersdk.Activites.Authentication;
import com.neno0o.ubersdk.Endpoints.Models.UserProfile.User;
import com.neno0o.ubersdk.Uber;
import com.neno0o.ubersdk.Widgets.UberButton;

import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;


public class MainActivity extends AppCompatActivity {

    public static final int UBER_AUTHENTICATION = 1;
    UberButton uberButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        uberButton = (UberButton) findViewById(R.id.uberBtn);
        uberButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Authentication.class);
                startActivityForResult(intent, UBER_AUTHENTICATION);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == UBER_AUTHENTICATION) {
            Log.wtf("token", Uber.getInstance().getAccessToken().getAccessTokenValue());
            Uber.getInstance().getUberAPIService().getMe(new Callback<User>() {
                @Override
                public void success(User user, Response response) {
                    Log.wtf("user", user.getFirstName());
                }

                @Override
                public void failure(RetrofitError error) {

                }
            });
        }
    }
}
