package com.neno0o.ubersdk.endpoints.models.requests.receiptrequest;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ChargeAdjustments {

    /**
     * The name of the charge adjustment.
     */
    @Expose
    @SerializedName("name")
    private String name;

    /**
     * The amount of the charge adjustment.
     */
    @Expose
    @SerializedName("amount")
    private double amount;

    @Expose
    @SerializedName("type")
    private String type;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
