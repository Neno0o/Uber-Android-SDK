package com.neno0o.ubersdk.Endpoints.Models.UserProfile;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class User {

    /**
     * First name of the Uber user.
     */
    @Expose
    @SerializedName("first_name")
    private String firstName;

    /**
     * Last name of the Uber user.
     */
    @Expose
    @SerializedName("last_name")
    private String lastName;

    /**
     * Email address of the Uber user.
     */
    @Expose
    @SerializedName("email")
    private String email;

    /**
     * Image URL of the Uber user.
     */
    @Expose
    @SerializedName("picture")
    private String picture;

    /**
     * Promo code of the Uber user.
     */
    @Expose
    @SerializedName("promo_code")
    private String promoCode;

    /**
     * Unique identifier of the Uber user
     */
    @Expose
    @SerializedName("uuid")
    private String uuid;


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getPromoCode() {
        return promoCode;
    }

    public void setPromoCode(String promoCode) {
        this.promoCode = promoCode;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }
}
