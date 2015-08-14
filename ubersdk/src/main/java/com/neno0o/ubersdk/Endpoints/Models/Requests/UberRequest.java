package com.neno0o.ubersdk.Endpoints.Models.Requests;

import android.location.Location;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UberRequest {

    /**
     * The unique ID of the Request.
     */
    @Expose
    @SerializedName("request_id")
    private String requestId;

    /**
     * The status of the Request indicating state.
     */
    @Expose
    @SerializedName("status")
    private UberStatus status;

    /**
     * The object that contains vehicle details.
     */
    @Expose
    @SerializedName("vehicle")
    private Vehicle vehicle;

    /**
     * The object that contains driver details.
     */
    @Expose
    @SerializedName("driver")
    private Driver driver;

    /**
     * The object that contains the location information of the vehicle and driver.
     */
    @Expose
    @SerializedName("location")
    private Location location;

    /**
     * The estimated time of vehicle arrival in minutes.
     */
    @Expose
    @SerializedName("eta")
    private int eta;

    /**
     * The surge pricing multiplier used to calculate the increased price of a Request. A
     * multiplier of 1.0 means surge pricing is not in effect.
     */
    @Expose
    @SerializedName("surge_multiplier")
    private double surgeMultiplier;


    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public UberStatus getStatus() {
        return status;
    }

    public void setStatus(UberStatus status) {
        this.status = status;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    public double getSurgeMultiplier() {
        return surgeMultiplier;
    }

    public void setSurgeMultiplier(double surgeMultiplier) {
        this.surgeMultiplier = surgeMultiplier;
    }
}
