package com.neno0o.ubersdk.Endpoints.Models.Requests;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Driver {

    /**
     * The formatted phone number for contacting the driver.
     */
    @Expose
    @SerializedName("phone_number")
    private String phoneNumber;

    /**
     * The driver's star rating out of 5 stars.
     */
    @Expose
    @SerializedName("rating")
    private double rating;

    /**
     * The URL to the photo of the driver.
     */
    @Expose
    @SerializedName("picture_url")
    private String pictureUrl;

    /**
     * The first name of the driver.
     */
    @Expose
    @SerializedName("name")
    private String name;


    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getPictureUrl() {
        return pictureUrl;
    }

    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
