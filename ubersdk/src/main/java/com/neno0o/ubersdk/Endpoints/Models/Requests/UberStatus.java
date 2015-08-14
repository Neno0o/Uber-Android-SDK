package com.neno0o.ubersdk.Endpoints.Models.Requests;

import com.google.gson.annotations.SerializedName;

public enum UberStatus {
    /**
     * The Request is matching to the most efficient available driver.
     */
    @SerializedName("processing")
    PROCESSING("processing"),
    /**
     * The Request has been accepted by a driver and is "en route" to the start_location.
     */
    @SerializedName("accepted")
    ACCEPTED("accepted"),
    /**
     * The driver has arrived or will be shortly.
     */
    @SerializedName("arriving")
    ARRIVING("arriving"),
    /**
     * The Request is "en route" from the start location to the end location.
     */
    @SerializedName("in_progress")
    IN_PROGRESS("in_progress"),
    /**
     * The Request has been canceled by the driver.
     */
    @SerializedName("driver_canceled")
    DRIVER_CANCELLED("driver_canceled"),
    /**
     * Request has been completed by the driver.
     */
    @SerializedName("completed")
    COMPLETED("completed"),

    /**
     * The following statuses cannot be set via PUT requests.
     * Instead, they are set via other API calls as described in the table
     */

    /**
     * The Request was unfulfilled because no drivers were available. Use the Product Types sandbox endpoint to
     * create a Request with this status.
     */
    @SerializedName("no_drivers_available")
    NO_DRIVERS_AVAILABLE("no_drivers_available"),
    /**
     * The Request canceled by rider. Issue a DELETE command to give a Request this status
     */
    @SerializedName("rider_canceled")
    RIDER_CANCELED("rider_canceled");

    private final String status;

    UberStatus(String status) {
        this.status = status;
    }
    public String value() {
        return status;
    }
}
