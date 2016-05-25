package com.neno0o.ubersdk.exceptions;

/**
 * No drivers available for requested product at time of request. Either instruct the rider to
 * select a different product to request or to wait until more drivers become available.
 */

public class NoDriversAvailableException extends Exception {

    public NoDriversAvailableException() {
        super("HTTP 409 error");
    }
}
