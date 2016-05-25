package com.neno0o.ubersdk.Endpoints.Models.Requests.EstimateRequest;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Trip {

    /**
     * The unit of distance (mile or km).
     */
    @Expose
    @SerializedName("distance_unit")
    private String distanceUnit;

    /**
     * Expected activity duration (in minutes).
     */
    @Expose
    @SerializedName("duration_estimate")
    private int durationEstimate;

    /**
     * Expected activity distance.
     */
    @Expose
    @SerializedName("distance_estimate")
    private double distanceEstimate;

    public String getDistance_unit() {
        return distanceUnit;
    }

    public void setDistance_unit(String distance_unit) {
        this.distanceUnit = distance_unit;
    }

    public int getDuration_estimate() {
        return durationEstimate;
    }

    public void setDuration_estimate(int duration_estimate) {
        this.durationEstimate = duration_estimate;
    }

    public double getDistance_estimate() {
        return distanceEstimate;
    }

    public void setDistance_estimate(double distance_estimate) {
        this.distanceEstimate = distance_estimate;
    }
}
