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

    public String getDistanceUnit() {
        return distance_unit;
    }

    public void setDistanceUnit(String distance_unit) {
        this.distance_unit = distance_unit;
    }

    public int getDurationEstimate() {
        return duration_estimate;
    }

    public void setDurationEstimate(int duration_estimate) {
        this.duration_estimate = duration_estimate;
    }

    public double getDistanceEstimate() {
        return distance_estimate;
    }

    public void setDistanceEstimate(double distance_estimate) {
        this.distance_estimate = distance_estimate;
    }
}
