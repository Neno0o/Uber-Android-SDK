package com.neno0o.ubersdk.Endpoints.Models.Requests.EstimateRequest;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UberEstimateBody {

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


    public UberEstimateBody(String productId, double startLatitude, double startLongitude,
                           double endLatitude, double endLongitude) {
        this.productId = productId;
        this.startLatitude = startLatitude;
        this.startLongitude = startLongitude;
        this.endLatitude = endLatitude;
        this.endLongitude = endLongitude;
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
}
