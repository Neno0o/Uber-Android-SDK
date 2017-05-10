package com.neno0o.ubersdk.exceptions;

/**
 * The supplied third party account is already associated with existing Uber account.
 */

public class ThirdPartyAccAssociatedException extends Exception {

    public ThirdPartyAccAssociatedException() {
        super("HTTP 422 error");
    }
}
