package com.neno0o.ubersdk.Exceptions;

/**
 * The product being requested is not available to the user. Have them select a different product to successfully make a request.
 */

public class ProductNotAllowedException extends Exception {

    public ProductNotAllowedException() {
        super("HTTP 403 error");
    }
}
