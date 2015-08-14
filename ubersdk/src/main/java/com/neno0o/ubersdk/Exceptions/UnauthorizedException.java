package com.neno0o.ubersdk.Exceptions;

/**
 * Unauthorized the request requires user authentication (not logged in).
 */

public class UnauthorizedException extends Exception {

    public UnauthorizedException() {
        super("HTTP 401 error");
    }
}
