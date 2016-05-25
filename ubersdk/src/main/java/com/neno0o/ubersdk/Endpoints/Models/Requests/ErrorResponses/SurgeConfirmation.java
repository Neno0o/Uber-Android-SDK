package com.neno0o.ubersdk.endpoints.models.requests.errorresponses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SurgeConfirmation {

    /**
     * The surge confirmation identifier used to make a Request after a user has accepted surge pricing.
     */
    @Expose
    @SerializedName("surge_confirmation_id")
    private String surgeConfirmationId;

    /**
     * The URL a user must visit to accept surge pricing.
     */
    @Expose
    @SerializedName("href")
    private String href;

    public String getSurgeConfirmationId() {
        return surgeConfirmationId;
    }

    public void setSurgeConfirmationId(String surgeConfirmationId) {
        this.surgeConfirmationId = surgeConfirmationId;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }
}