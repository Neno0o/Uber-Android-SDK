package com.neno0o.ubersdk.exceptions;

/**
 * This user is forbidden from making a request at this time and should consult our support team by visiting
 * https://help.uber.com
 * or by emailing support@uber.com.
 */

public class ForbiddenException extends Exception{

    public ForbiddenException() {
        super("HTTP 403 error");
    }

}
