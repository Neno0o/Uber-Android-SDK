package com.neno0o.ubersdk.Exceptions;

/**
 * The rider's payment method is invalid. The user must update the billing info.
 */

public class InvalidPaymentException extends Exception {

    public InvalidPaymentException() {
        super("HTTP 400 error");
    }
}
