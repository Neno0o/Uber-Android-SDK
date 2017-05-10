package com.neno0o.ubersdk.exceptions;

/**
 * The fare has expired for the requested product. Please get estimates again,
 * confirm the new fare, and then re-request.
 */

public class FareExpiredException extends Exception {

    public FareExpiredException() {
        super("HTTP 409 error");
    }
}
