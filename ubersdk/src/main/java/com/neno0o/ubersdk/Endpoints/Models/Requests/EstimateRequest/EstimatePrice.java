package com.neno0o.ubersdk.Endpoints.Models.Requests.EstimateRequest;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class EstimatePrice {

    /**
     * The URL a user must visit to accept surge pricing.
     */
    @Expose
    @SerializedName("surge_confirmation_href")
    private String surge_confirmation_href;

    /**
     * Upper bound of the estimated price.
     */
    @Expose
    @SerializedName("high_estimate")
    private int high_estimate;

    /**
     * The unique identifier of the surge session for a user. null if no surge is currently in effect.
     */
    @Expose
    @SerializedName("surge_confirmation_id")
    private String surge_confirmation_id;

    /**
     * The minimum fare of a trip. Should only be displayed or used if no end location is provided.
     */
    @Expose
    @SerializedName("minimum")
    private int minimum;

    /**
     * Lower bound of the estimated price.
     */
    @Expose
    @SerializedName("low_estimate")
    private int low_estimate;

    /**
     * Expected surge multiplier. Surge is active if surge_multiplier is greater than 1. Fare estimates below factor in the surge multiplier.
     */
    @Expose
    @SerializedName("surge_multiplier")
    private double surge_multiplier;

    /**
     * Formatted string of estimate in local currency of the start location.
     * Estimate could be a range, a single number (flat rate) or "Metered" for TAXI.
     */
    @Expose
    @SerializedName("display")
    private String display;

    /**
     * ISO 4217 currency code.
     */
    @Expose
    @SerializedName("currency_code")
    private String currency_code;


    public String getSurge_confirmation_href() {
        return surge_confirmation_href;
    }

    public void setSurge_confirmation_href(String surgeConfirmationHref) {
        this.surge_confirmation_href = surgeConfirmationHref;
    }

    public int getHigh_estimate() {
        return high_estimate;
    }

    public void setHigh_estimate(int highEstimate) {
        this.high_estimate = highEstimate;
    }

    public String getSurge_confirmation_id() {
        return surge_confirmation_id;
    }

    public void setSurge_confirmation_id(String surgeConfirmationId) {
        this.surge_confirmation_id = surgeConfirmationId;
    }

    public int getMinimum() {
        return minimum;
    }

    public void setMinimum(int minimum) {
        this.minimum = minimum;
    }

    public int getLow_estimate() {
        return low_estimate;
    }

    public void setLow_estimate(int lowEstimate) {
        this.low_estimate = lowEstimate;
    }

    public double getSurge_multiplier() {
        return surge_multiplier;
    }

    public void setSurge_multiplier(double surgeMultiplier) {
        this.surge_multiplier = surgeMultiplier;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public String getCurrency_code() {
        return currency_code;
    }

    public void setCurrency_code(String currencyCode) {
        this.currency_code = currencyCode;
    }
}
