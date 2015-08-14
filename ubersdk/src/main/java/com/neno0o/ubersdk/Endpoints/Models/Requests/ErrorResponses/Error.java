package com.neno0o.ubersdk.Endpoints.Models.Requests.ErrorResponses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Error {

    @Expose
    @SerializedName("status")
    private int status;

    @Expose
    @SerializedName("code")
    private String code;

    @Expose
    @SerializedName("title")
    private String title;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
