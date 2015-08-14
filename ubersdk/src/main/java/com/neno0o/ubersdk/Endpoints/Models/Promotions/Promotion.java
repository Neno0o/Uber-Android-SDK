package com.neno0o.ubersdk.Endpoints.Models.Promotions;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Promotion {

    /**
     * A localized string we recommend to use when offering the promotion to users.
     */
    @Expose
    @SerializedName("display_text")
    private String displayText;

    /**
     * The value of the promotion that is available to a user in this location in the local currency.
     */
    @Expose
    @SerializedName("localized_value")
    private String localizedValue;

    /**
     * The type of the promo which is either "trip_credit" or "account_credit".
     */
    @Expose
    @SerializedName("type")
    private String type;

    public String getDisplayText() {
        return displayText;
    }

    public void setDisplayText(String displayText) {
        this.displayText = displayText;
    }

    public String getLocalizedValue() {
        return localizedValue;
    }

    public void setLocalizedValue(String localizedValue) {
        this.localizedValue = localizedValue;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
