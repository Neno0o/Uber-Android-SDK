package com.neno0o.ubersdk.Auth.Service;

import com.neno0o.ubersdk.Auth.Models.AccessToken;

import retrofit.Callback;
import retrofit.http.POST;
import retrofit.http.Query;

public interface UberAuthService {

    /**
     * https://developer.uber.com/v1/auth/
     * Exchange this authorization code for an access_token, which will allow you to make requests on
     * behalf of a user. The access_token expires in 30 days. The grant_type may be authorization_code or refresh_token.
     *
     * @param clientId     A 32 character string (public)
     * @param clientSecret A 40 character string. DO NOT SHARE. This should not be available on any public facing
     *                     server or web site. If you have been compromised or shared this token accidentally please
     *                     reset your client_secret via our web interface. This will require updating your application
     *                     to use the newly issued client_secret.
     * @param grantType    The grant_type may be authorization_code or refresh_token
     * @param code         Exchange this authorization code for an access_token, which will allow you to make requests on behalf of a user
     * @param redirectUrl  The URI we will redirect back to after an authorization by the resource owner.
     *                     The base of the URI must match the redirect_uri used during the registration of
     *                     your application.
     * @return AccessToken
     */

    @POST("/oauth/token")
    AccessToken getAuthToken(@Query("client_secret") String clientSecret,
                             @Query("client_id") String clientId,
                             @Query("grant_type") String grantType,
                             @Query("code") String code,
                             @Query("redirect_uri") String redirectUrl);

    @POST("/oauth/token")
    void getAuthToken(@Query("client_secret") String clientSecret,
                      @Query("client_id") String clientId,
                      @Query("grant_type") String grantType,
                      @Query("code") String code,
                      @Query("redirect_uri") String redirectUrl,
                      Callback<AccessToken> callback);
}
