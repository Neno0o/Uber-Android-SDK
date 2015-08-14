package com.neno0o.ubersdk.Auth.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * This class represents POJO access token for using Uber APIs. It also includes
 * associated metadata such as expiration date and scopes.
 * <p/>
 * For more information on access tokens, see
 * https://developer.uber.com/v1/auth/
 */
public class AccessToken {

    @Expose
    @SerializedName("access_token")
    private String accessTokenValue;

    @Expose
    @SerializedName("refresh_token")
    private String refreshToken;

    @Expose
    @SerializedName("token_type")
    private String tokenType;

    @Expose
    @SerializedName("expires_in")
    private String expiresIn;

    @Expose
    @SerializedName("scope")
    private String scope;

    public AccessToken() {
    }

    public String getAccessTokenValue() {
        return this.accessTokenValue;
    }

    public void setAccessTokenValue(String paramString) {
        this.accessTokenValue = paramString;
    }

    public String getTokenType() {
        return this.tokenType;
    }

    public void setTokenType(String paramString) {
        this.tokenType = paramString;
    }

    public String getExpiresIn() {
        return expiresIn;
    }

    public void setExpiresIn(String expiresIn) {
        this.expiresIn = expiresIn;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public String getRefreshToken() {
        return refreshToken;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }

}
