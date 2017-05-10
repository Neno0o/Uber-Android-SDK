package com.neno0o.ubersdk.Endpoints.Models.Times;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Time {

    /**
     * Unique identifier representing a specific product for a given latitude & longitude.
     * For example, uberX in San Francisco will have a different product_id than uberX in Los Angeles.
     */
    @Expose
    @SerializedName("product_id")
    private String productId;

    /**
     * Display name of product.
     */
    @Expose
    @SerializedName("display_name")
    private String displayName;

    /**
     * ETA for the product (in seconds). Always show estimate in minutes.
     */
    @Expose
    @SerializedName("estimate")
    private int estimate;

    @Expose
    @SerializedName("localized_display_name")
    private String localized_display_name;

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public int getEstimate() {
        return estimate;
    }

    public void setEstimate(int estimate) {
        this.estimate = estimate;
    }

    public String getLocalizedDisplayName() {
        return localized_display_name;
    }

    public void setLocalizedDisplayName(String localized_display_name) {
        this.localized_display_name = localized_display_name;
    }
}
