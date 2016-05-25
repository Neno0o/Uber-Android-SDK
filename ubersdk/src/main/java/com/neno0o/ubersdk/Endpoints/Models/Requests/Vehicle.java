package com.neno0o.ubersdk.endpoints.models.requests;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Vehicle {

    /**
     * The vehicle make or brand.
     */
    @Expose
    @SerializedName("make")
    private String make;

    /**
     * The vehicle model or type.
     */
    @Expose
    @SerializedName("model")
    private String model;

    /**
     * The license plate number of the vehicle.
     */
    @Expose
    @SerializedName("license_plate")
    private String licensePlate;

    /**
     * The URL to a stock photo of the vehicle (may be null).
     */
    @Expose
    @SerializedName("picture_url")
    private String pictureUrl;


    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getPictureUrl() {
        return pictureUrl;
    }

    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
    }
}
