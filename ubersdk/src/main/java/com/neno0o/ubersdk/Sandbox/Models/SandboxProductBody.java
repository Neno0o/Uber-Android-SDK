package com.neno0o.ubersdk.sandbox.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * this class implements a JSON body indicating what you would like the surge_multiplier to be when
 * making a Request to a particular Product.
 */
public class SandboxProductBody {

    /**
     * Content-Type: application/json
     * {
     * "surge_multiplier": 2.2,
     * "drivers_available": true
     * }
     */

    /**
     * The surge multiple a Product should have when making a Request in the Sandbox.
     * A multiplier greater than or equal to 2.0 will require the two stage confirmation screen.
     */
    @Expose
    @SerializedName("surge_multiplier")
    private double surgeMultiplier;

    /**
     * If False, attempts to make a Request in the Sandbox will return a no_drivers_available error
     */
    @Expose
    @SerializedName("drivers_available")
    private Boolean driversAvailable;

    public SandboxProductBody(Float surgeMultiplier, Boolean driversAvailable) {
        this.surgeMultiplier = surgeMultiplier;
        this.driversAvailable = driversAvailable;
    }

    public double getSurgeMultiplier() {
        return surgeMultiplier;
    }

    public void setSurgeMultiplier(double surgeMultiplier) {
        this.surgeMultiplier = surgeMultiplier;
    }

    public boolean isDriversAvailable() {
        return driversAvailable;
    }

    public void setDriversAvailable(boolean driversAvailable) {
        this.driversAvailable = driversAvailable;
    }
}
