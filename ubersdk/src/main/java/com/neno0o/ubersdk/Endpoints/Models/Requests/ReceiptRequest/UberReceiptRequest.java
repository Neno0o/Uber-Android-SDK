package com.neno0o.ubersdk.Endpoints.Models.Requests.ReceiptRequest;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class UberReceiptRequest {

    /**
     * Unique identifier representing a Request.
     */
    @Expose
    @SerializedName("request_id")
    private String request_id;

    /**
     * The summation of the charges.
     */
    @Expose
    @SerializedName("normal_fare")
    private double normal_fare;

    /**
     * The summation of the normal_fare and surge_charge.
     */
    @Expose
    @SerializedName("subtotal")
    private double subtotal;

    /**
     * The total amount charged to the users payment method. This is the the subtotal (split if applicable) with taxes included.
     */
    @Expose
    @SerializedName("total_charged")
    private double total_charged;

    /**
     * The total amount still owed after attempting to charge the user. May be null if amount was paid in full.
     */
    @Expose
    @SerializedName("total_owed")
    private double total_owed;

    /**
     * ISO 4217
     */
    @Expose
    @SerializedName("currency_code")
    private String currency_code;

    /**
     * Time duration of the trip in ISO 8061 HH:MM:SS format.
     */
    @Expose
    @SerializedName("duration")
    private String duration;

    /**
     * Distance of the trip charged.
     */
    @Expose
    @SerializedName("distance")
    private String distance;

    /**
     * The localized unit of distance.
     */
    @Expose
    @SerializedName("distance_label")
    private String distance_label;

    /**
     * Describes the charges made against the rider.
     */
    @Expose
    @SerializedName("charges")
    private List<Charges> charges;

    /**
     * Describes the surge charge. May be null if surge pricing was not in effect.
     */
    @Expose
    @SerializedName("surge_charge")
    private SurgeCharge surge_charge;

    /**
     * Adjustments made to the charges such as promotions, and fees.
     */
    @Expose
    @SerializedName("charge_adjustments")
    private List<ChargeAdjustments> charge_adjustments;


    public String getRequest_id() {
        return request_id;
    }

    public void setRequest_id(String requestId) {
        this.request_id = requestId;
    }

    public double getNormal_fare() {
        return normal_fare;
    }

    public void setNormal_fare(double normalFare) {
        this.normal_fare = normalFare;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getTotal_charged() {
        return total_charged;
    }

    public void setTotal_charged(double totalCharged) {
        this.total_charged = totalCharged;
    }

    public double getTotal_owed() {
        return total_owed;
    }

    public void setTotal_owed(double totalOwed) {
        this.total_owed = totalOwed;
    }

    public String getCurrency_code() {
        return currency_code;
    }

    public void setCurrency_code(String currencyCode) {
        this.currency_code = currencyCode;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    public String getDistance_label() {
        return distance_label;
    }

    public void setDistance_label(String distanceLabel) {
        this.distance_label = distanceLabel;
    }

    public List<Charges> getCharges() {
        return charges;
    }

    public void setCharges(List<Charges> charges) {
        this.charges = charges;
    }

    public SurgeCharge getSurge_charge() {
        return surge_charge;
    }

    public void setSurge_charge(SurgeCharge surgeCharge) {
        this.surge_charge = surgeCharge;
    }

    public List<ChargeAdjustments> getCharge_adjustments() {
        return charge_adjustments;
    }

    public void setCharge_adjustments(List<ChargeAdjustments> chargeAdjustments) {
        this.charge_adjustments = chargeAdjustments;
    }
}
