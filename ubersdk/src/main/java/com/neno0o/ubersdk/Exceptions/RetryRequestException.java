package com.neno0o.ubersdk.Exceptions;

/**
 * An error has occurred when the attempting to request a product.
 * Please reattempt the request on behalf of the user.
 */
public class RetryRequestException extends Exception {

    public RetryRequestException() {
        super("HTTP 409 error");
    }
}
