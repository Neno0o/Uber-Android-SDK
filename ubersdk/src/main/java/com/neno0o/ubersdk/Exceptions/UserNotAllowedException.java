package com.neno0o.ubersdk.Exceptions;

/**
 * The rider has an outstanding balance and must update her account settings by using
 * the native mobile application or by visiting
 * https://riders.uber.com.
 */

public class UserNotAllowedException extends Exception {

    public UserNotAllowedException() {
        super("HTTP 400 error");
    }
}
