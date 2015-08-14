package com.neno0o.ubersdk.Exceptions;

/**
 * Surge pricing is currently in effect for this product. Please have the user confirm surge pricing by
 * sending them to the surge_confirmation_href described in the Request Tutorial.
 */
public class SurgeException extends Exception {

    public SurgeException() {
        super("HTTP 409 error");
    }
}
