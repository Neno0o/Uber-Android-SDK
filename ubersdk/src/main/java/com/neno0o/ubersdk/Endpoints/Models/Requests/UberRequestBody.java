package com.neno0o.ubersdk.endpoints.models.requests;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UberRequestBody {

    /**
     * The unique ID of the product being requested.
     */
    @Expose
    @SerializedName("product_id")
    private String productId;

    /**
     * The beginning or "pickup" latitude.
     */
    @Expose
    @SerializedName("start_latitude")
    private double startLatitude;

    /**
     * The beginning or "pickup" longitude.
     */
    @Expose
    @SerializedName("start_longitude")
    private double startLongitude;

    /**
     * The final or destination latitude.
     */
    @Expose
    @SerializedName("end_latitude")
    private double endLatitude;

    /**
     * The final or destination longitude.
     */
    @Expose
    @SerializedName("end_longitude")
    private double endLongitude;

    /**
     * The unique identifier of the surge session for a user.
     * Required when returned from a 409 Conflict response on previous POST attempt.
     */
    @Expose
    @SerializedName("surge_confirmation_id")
    private String surgeConfirmationId;


    public UberRequestBody(String productId, double startLatitude, double startLongitude,
                       double endLatitude, double endLongitude, String surgeConfirmationId) {
        this.productId = productId;
        this.startLatitude = startLatitude;
        this.startLongitude = startLongitude;
        this.endLatitude = endLatitude;
        this.endLongitude = endLongitude;
        this.surgeConfirmationId = surgeConfirmationId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public double getStartLatitude() {
        return startLatitude;
    }

    public void setStartLatitude(double startLatitude) {
        this.startLatitude = startLatitude;
    }

    public double getStartLongitude() {
        return startLongitude;
    }

    public void setStartLongitude(double startLongitude) {
        this.startLongitude = startLongitude;
    }

    public double getEndLatitude() {
        return endLatitude;
    }

    public void setEndLatitude(double endLatitude) {
        this.endLatitude = endLatitude;
    }

    public double getEndLongitude() {
        return endLongitude;
    }

    public void setEndLongitude(double endLongitude) {
        this.endLongitude = endLongitude;
    }

    public String getSurgeConfirmationId() {
        return surgeConfirmationId;
    }

    public void setSurgeConfirmationId(String surgeConfirmationId) {
        this.surgeConfirmationId = surgeConfirmationId;
    }
}
