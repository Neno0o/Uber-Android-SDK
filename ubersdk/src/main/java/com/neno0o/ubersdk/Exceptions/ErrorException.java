package com.neno0o.ubersdk.exceptions;

/**
 * An unknown error has occurred.
 */

public class ErrorException extends Exception {

    public ErrorException() {
        super("HTTP 409 error");
    }
}
