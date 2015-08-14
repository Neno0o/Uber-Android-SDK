package com.neno0o.ubersdk.Endpoints.Models.Requests.EstimateRequest;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Trip {

    /**
     * The unit of distance (mile or km).
     */
    @Expose
    @SerializedName("distance_unit")
    private String distance_unit;

    /**
     * Expected activity duration (in minutes).
     */
    @Expose
    @SerializedName("duration_estimate")
    private int duration_estimate;

    /**
     * Expected activity distance.
     */
    @Expose
    @SerializedName("distance_estimate")
    private double distance_estimate;

    public String getDistance_unit() {
        return distance_unit;
    }

    public void setDistance_unit(String distance_unit) {
        this.distance_unit = distance_unit;
    }

    public int getDuration_estimate() {
        return duration_estimate;
    }

    public void setDuration_estimate(int duration_estimate) {
        this.duration_estimate = duration_estimate;
    }

    public double getDistance_estimate() {
        return distance_estimate;
    }

    public void setDistance_estimate(double distance_estimate) {
        this.distance_estimate = distance_estimate;
    }
}
