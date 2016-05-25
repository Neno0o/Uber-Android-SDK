package com.neno0o.ubersdk.endpoints.models.requests.errorresponses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ErrorResponse {

    @Expose
    @SerializedName("meta")
    private Meta meta;

    @Expose
    @SerializedName("errors")
    private List<Error> errors;

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    public List<Error> getErrors() {
        return errors;
    }

    public void setErrors(List<Error> errors) {
        this.errors = errors;
    }
}
