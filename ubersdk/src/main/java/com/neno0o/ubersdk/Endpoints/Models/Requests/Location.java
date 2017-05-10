package com.neno0o.ubersdk.endpoints.models.requests;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Location {

    /**
     * The current latitude of the vehicle.
     */
    @Expose
    @SerializedName("latitude")
    private double latitude;

    /**
     * The current longitude of the vehicle.
     */
    @Expose
    @SerializedName("longitude")
    private double longitude;

    /**
     * The current bearing of the vehicle in degrees (0-359).
     */
    @Expose
    @SerializedName("bearing")
    private int bearing;

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public int getBearing() {
        return bearing;
    }

    public void setBearing(int bearing) {
        this.bearing = bearing;
    }
}
