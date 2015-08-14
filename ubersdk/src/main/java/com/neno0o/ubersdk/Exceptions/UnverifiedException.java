package com.neno0o.ubersdk.Exceptions;

/**
 * The user hasn’t confirmed their mobile number. Instruct the user to confirm
 * their mobile phone number within the native mobile application or by visiting
 * https://riders.uber.com.
 */

public class UnverifiedException extends Exception {

    public UnverifiedException() {
        super("HTTP 403 error");
    }

}
