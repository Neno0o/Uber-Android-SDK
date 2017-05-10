package com.neno0o.ubersdk.sandbox.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.neno0o.ubersdk.endpoints.models.requests.UberStatus;

/**
 * This class implements a JSON body indicating how you would like to manipulate the status of a Request.
 */
public class SandboxRequestBody {

    /**
     * Content-Type: application/json
     * {"status": "accepted"}
     */
    @Expose
    @SerializedName("status")
    private UberStatus status;

    public SandboxRequestBody(UberStatus status) {
        this.status = status;
    }

    public UberStatus getStatus() {
        return status;
    }

    public void setStatus(UberStatus status) {
        this.status = status;
    }
}
