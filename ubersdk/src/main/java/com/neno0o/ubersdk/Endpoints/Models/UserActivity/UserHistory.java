package com.neno0o.ubersdk.Endpoints.Models.UserActivity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.Date;

public class UserHistory {

    /**
     * Unique activity identifier.
     */
    @Expose
    @SerializedName("request_id")
    private String request_id;

    /**
     * Unix timestamp of activity request time.
     */
    @Expose
    @SerializedName("request_time")
    private Date requestTime;

    /**
     * Unique identifier representing a specific product for a given latitude & longitude.
     * For example, uberX in San Francisco will have a different product_id than uberX in Los Angeles.
     */
    @Expose
    @SerializedName("product_id")
    private String productId;

    /**
     * Status of the activity. Only returns completed for now.
     */
    @Expose
    @SerializedName("status")
    private String status;

    /**
     * Length of activity in miles.
     */
    @Expose
    @SerializedName("distance")
    private double distance;

    /**
     * Unix timestamp of activity start time.
     */
    @Expose
    @SerializedName("start_time")
    private Date startTime;

    /**
     * Unix timestamp of activity end time.
     */
    @Expose
    @SerializedName("end_time")
    private Date endTime;

    /**
     * Details about the city the activity started in.
     */
    @Expose
    @SerializedName("start_city")
    private StartCity start_city;


    public String getRequest_id() {
        return request_id;
    }

    public void setRequest_id(String request_id) {
        this.request_id = request_id;
    }

    public Date getRequestTime() {
        return requestTime;
    }

    public void setRequestTime(Date requestTime) {
        this.requestTime = requestTime;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public StartCity getStart_city() {
        return start_city;
    }

    public void setStart_city(StartCity start_city) {
        this.start_city = start_city;
    }

    public class StartCity {

        /**
         * Latitude of the center of the start_city.
         */
        @Expose
        @SerializedName("latitude")
        private double latitude;

        /**
         * Longitude of the center of the start_city.
         */
        @Expose
        @SerializedName("longitude")
        private double longitude;

        /**
         * The name of the start_city
         */
        @Expose
        @SerializedName("display_name")
        private String display_name;

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

        public String getDisplay_name() {
            return display_name;
        }

        public void setDisplay_name(String display_name) {
            this.display_name = display_name;
        }
    }
}
