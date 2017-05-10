package com.neno0o.ubersdk.exceptions;

/**
 * The user hasn’t confirmed their email address. Instruct the user
 * to confirm their email address within the native mobile application or by visiting
 * https://riders.uber.com.
 */

public class UncofirmedEmailExceptions extends Exception {

    public UncofirmedEmailExceptions() {
        super("HTTP 400 error");
    }
}
