package com.neno0o.ubersdk.endpoints.models.prices;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Price {

    /**
     * Unique identifier representing a specific product for a given latitude & longitude.
     * For example, uberX in San Francisco will have a different product_id than uberX in Los Angeles
     */
    @Expose
    @SerializedName("product_id")
    private String productId;

    /**
     * ISO 4217 currency code.
     */
    @Expose
    @SerializedName("currency_code")
    private String currencyCode;

    /**
     * Display name of product.
     */
    @Expose
    @SerializedName("display_name")
    private String displayName;

    /**
     * Formatted string of estimate in local currency of the start location.
     * Estimate could be a range, a single number (flat rate) or "Metered" for TAXI.
     */
    @Expose
    @SerializedName("estimate")
    private String estimate;

    /**
     * Lower bound of the estimated price.
     */
    @Expose
    @SerializedName("low_estimate")
    private int lowEstimate;

    /**
     * Upper bound of the estimated price.
     */
    @Expose
    @SerializedName("high_estimate")
    private int highEstimate;

    /**
     * Expected surge multiplier. Surge is active if surge_multiplier is greater than 1.
     * Price estimate already factors in the surge multiplier.
     */
    @Expose
    @SerializedName("surge_multiplier")
    private double surgeMultiplier;

    /**
     * Expected activity duration (in seconds). Always show duration in minutes.
     */
    @Expose
    @SerializedName("duration")
    private int duration;

    /**
     * Expected activity distance (in miles).
     */
    @Expose
    @SerializedName("distance")
    private double distance;

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getEstimate() {
        return estimate;
    }

    public void setEstimate(String estimate) {
        this.estimate = estimate;
    }

    public int getLowEstimate() {
        return lowEstimate;
    }

    public void setLowEstimate(int lowEstimate) {
        this.lowEstimate = lowEstimate;
    }

    public int getHighEstimate() {
        return highEstimate;
    }

    public void setHighEstimate(int highEstimate) {
        this.highEstimate = highEstimate;
    }

    public double getSurgeMultiplier() {
        return surgeMultiplier;
    }

    public void setSurgeMultiplier(double surgeMultiplier) {
        this.surgeMultiplier = surgeMultiplier;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }
}
