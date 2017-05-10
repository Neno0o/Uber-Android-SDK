package com.neno0o.ubersdk.endpoints.models.requests.estimaterequest;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UberEstimateRequest {

    /**
     * The estimated time of vehicle arrival in minutes. null if there are no cars available.
     */
    @Expose
    @SerializedName("pickup_estimate")
    private int pickup_estimate;

    /**
     * Details of the estimated fare. If end location is omitted, only the minimum is returned.
     */
    @Expose
    @SerializedName("price")
    private EstimatePrice price;

    /**
     * Details of the estimated distance. null if end location is omitted.
     */
    @Expose
    @SerializedName("trip")
    private Trip trip;


    public int getPickup_estimate() {
        return pickup_estimate;
    }

    public void setPickup_estimate(int pickup_estimate) {
        this.pickup_estimate = pickup_estimate;
    }

    public EstimatePrice getPrice() {
        return price;
    }

    public void setPrice(EstimatePrice price) {
        this.price = price;
    }

    public Trip getTrip() {
        return trip;
    }

    public void setTrip(Trip trip) {
        this.trip = trip;
    }
}
