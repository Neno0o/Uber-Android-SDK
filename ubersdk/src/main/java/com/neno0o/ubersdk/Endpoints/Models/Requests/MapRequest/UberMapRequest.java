package com.neno0o.ubersdk.Endpoints.Models.Requests.MapRequest;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UberMapRequest {

    /**
     * Unique identifier representing a Request.
     */
    @Expose
    @SerializedName("request_id")
    private String requestId;

    /**
     * URL to a map representing the requested trip.
     */
    @Expose
    @SerializedName("href")
    private String href;


    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }
}
