package com.neno0o.ubersdk.Exceptions;

/**
 * The rider must have at least one payment method on file to request a car. The rider must add a payment method by
 * using the native mobile application or by visiting
 * https://riders.uber.com.
 */

public class MissingPaymentMethod extends Exception {

    public MissingPaymentMethod() {
        super("HTTP 400 error");
    }
}
