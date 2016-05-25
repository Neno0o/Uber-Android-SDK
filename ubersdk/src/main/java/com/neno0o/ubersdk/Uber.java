package com.neno0o.ubersdk;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.neno0o.ubersdk.auth.models.AccessToken;
import com.neno0o.ubersdk.auth.service.UberAuthService;
import com.neno0o.ubersdk.endpoints.service.UberAPIService;
import com.neno0o.ubersdk.exceptions.ForbiddenException;
import com.neno0o.ubersdk.exceptions.UnauthorizedException;
import com.neno0o.ubersdk.sandbox.service.UberSandboxService;

import java.lang.reflect.Type;
import java.util.Date;

import retrofit.ErrorHandler;
import retrofit.RequestInterceptor;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.converter.GsonConverter;

/**
 * Uber client object implements singleton.
 *
 * This class provides a way to access its only object which can be accessed directly without
 * need to instantiate the object of the class.
 */
public class Uber {

    /**
     * An object of Uber
     */
    private static Uber uber = new Uber();


    /**
     * Uber app PARAMETERS
     */
    private String clientId;
    private String clientSecret;
    private String serverToken;
    private String clientRedirectUri;

    private String responeType = "code";
    private String grantType = "authorization_code";

    /**
     * Exchanging this authorization code for an access_token, which will allow to make requests on behalf of a user.
     * The access_token expires in 30 days. The grant_type may be authorization_code or refresh_token.
     */
    private AccessToken accessToken;


    /**
     * APIs Services
     */
    private UberAuthService uberAuthService;
    private UberAPIService uberAPIService;
    private UberSandboxService uberSandboxService;

    private Gson gson;

    /**
     * Returns an instance associated with the uber configuration bound to this class.
     *
     * @return default singleton instance
     */
    public static Uber getInstance() {
        return uber;
    }

    /**
     * initialize Uber app by constructing all APIs services
     *
     * @param clientId A 32 character string (public)
     * @param clientSecret A 40 character string. DO NOT SHARE.
     *                     This should not be available on any public facing server or web site.
     *                     If you have been compromised or shared this token accidentally please reset your client_secret
     *                     via our web interface. This will require updating your application to use the newly issued client_secret.
     * @param serverToken A 40 character string. DO NOT SHARE.
     *                    This must be used for requests that are not issued on behalf of a User.
     * @param clientRedirectUri These URLs will be used during OAuth Authentication. To learn more about using OAuth please refer to OAuth Guide.
     */
    public void init(String clientId, String clientSecret, String serverToken, String clientRedirectUri) {
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.serverToken = serverToken;
        this.clientRedirectUri = clientRedirectUri;

        GsonBuilder gsonBuilder = new GsonBuilder()
                .excludeFieldsWithoutExposeAnnotation()
                .registerTypeAdapter(Date.class, new JsonDeserializer<Date>() {
                    public Date deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
                        return new Date(json.getAsJsonPrimitive().getAsLong());
                    }
                });
        gson = gsonBuilder.create();

        RestAdapter apiRestAdapter = new RestAdapter.Builder()
                .setEndpoint(UberURLs.API_URL)
                .setConverter(new GsonConverter(gson))
                .setRequestInterceptor(new RequestInterceptor() {
                    @Override
                    public void intercept(RequestFacade request) {
                        if (hasAccessToken()) {
                            request.addHeader("Authorization", "Bearer " + getAccessToken().getAccessTokenValue());
                            return;
                        } else if (hasServerToken()) {
                            request.addHeader("Authorization", "Token " + getServerToken());
                        }
                    }
                })
                .setErrorHandler(new ErrorHandler() {
                    @Override
                    public Throwable handleError(RetrofitError retrofitError) {
                        if (retrofitError != null && retrofitError.getResponse() != null) {
                            switch (retrofitError.getResponse().getStatus()) {
                                case 401: //Unauthorized
                                    return new UnauthorizedException();
                                case 403: //Forbidden
                                    return new ForbiddenException();
                            }
                        }
                        return retrofitError;
                    }
                })
                .setLogLevel(RestAdapter.LogLevel.FULL)
                .build();


        uberAPIService = apiRestAdapter.create(UberAPIService.class);

        RestAdapter authRestAdapter = new RestAdapter.Builder()
                .setEndpoint(UberURLs.OAUTH_URL)
                .setLogLevel(BuildConfig.DEBUG ? RestAdapter.LogLevel.FULL : RestAdapter.LogLevel.NONE)
                .setConverter(new GsonConverter(gson))
                .build();

        uberAuthService = authRestAdapter.create(UberAuthService.class);

        RestAdapter sandboxRestAdapter = new RestAdapter.Builder()
                .setEndpoint(UberURLs.SANDBOX_URL)
                .setLogLevel(BuildConfig.DEBUG ? RestAdapter.LogLevel.FULL : RestAdapter.LogLevel.NONE)
                .setConverter(new GsonConverter(gson))
                .build();

        uberSandboxService = sandboxRestAdapter.create(UberSandboxService.class);
    }


    public String getClientId() {
        return this.clientId;
    }

    public String getClientSecret() {
        return this.clientSecret;
    }

    public String getServerToken() {
        return serverToken;
    }

    public String getClientRedirectUri() {
        return clientRedirectUri;
    }

    public String getResponeType() {
        return responeType;
    }

    public String getGrantType() {
        return grantType;
    }

    public boolean hasAccessToken() {
        return accessToken != null && accessToken.getAccessTokenValue().length() > 0;
    }

    public AccessToken getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(AccessToken accessToken) {
        this.accessToken = accessToken;
    }

    public boolean hasServerToken() {
        return serverToken != null && serverToken.length() > 0;
    }

    public UberAPIService getUberAPIService() {
        return uberAPIService;
    }

    public UberAuthService getUberAuthService() {
        return uberAuthService;
    }

    public UberSandboxService getUberSandboxService() {
        return uberSandboxService;
    }

    public Gson getGson() {
        return gson;
    }
}
