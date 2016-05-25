package com.neno0o.ubersdk.endpoints.models.requests.errorresponses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Meta {

    @Expose
    @SerializedName("surge_confirmation")
    private SurgeConfirmation surgeConfirmation;

    public SurgeConfirmation getSurgeConfirmation() {
        return surgeConfirmation;
    }

    public void setSurgeConfirmation(SurgeConfirmation surgeConfirmation) {
        this.surgeConfirmation = surgeConfirmation;
    }
}
