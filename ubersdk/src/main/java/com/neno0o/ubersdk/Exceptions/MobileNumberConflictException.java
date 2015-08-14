package com.neno0o.ubersdk.Exceptions;

/**
 * The user’s mobile number has already been claimed by an existing Uber account.
 * Have them update their mobile number within the native mobile application,
 * by visiting https://riders.uber.com
 * or by reaching out to our support team via https://help.uber.com and emailing support@uber.com.
 */

public class MobileNumberConflictException extends Exception {

    public MobileNumberConflictException() {
        super("HTTP 422 error");
    }
}
