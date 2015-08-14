package com.neno0o.ubersdk.Exceptions;

/**
 * The rider has an outstanding balance and must update her account settings
 * by using the native mobile application or by visiting
 * https://riders.uber.com.
 */

public class PayBalanceException extends Exception {

    public PayBalanceException() {
        super("HTTP 400 error");
    }
}
