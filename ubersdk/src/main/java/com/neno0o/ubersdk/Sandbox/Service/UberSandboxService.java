package com.neno0o.ubersdk.sandbox.service;

import com.neno0o.ubersdk.sandbox.models.SandboxProductBody;
import com.neno0o.ubersdk.sandbox.models.SandboxRequestBody;

import retrofit.client.Response;
import retrofit.http.Body;
import retrofit.http.PUT;
import retrofit.http.Path;

/**
 * The Uber API Sandbox provides development endpoints for testing the functionality of an application
 * without making calls to the production Uber platform.
 * All requests made to the Sandbox environment will be ephemeral.
 * For more information, check
 * https://developer.uber.com/v1/sandbox/
 */

public interface UberSandboxService {

    /**
     * Currently the sandbox does not change states automatically the way a real Request in production would,
     * so this endpoint gives the ability to walk an application through the different states of a Request.
     *
     * This endpoint effectively just modifies the status of an ongoing sandbox Request.
     * Accepts a JSON body indicating how you would like to manipulate the status of a Request.
     *
     * @param requestId The unique ID of the Request.
     * @param requestBody The value to change a Request's status to. Ex, {"status": "accepted"}
     * @return Status-code: 204 Success
     */
    @PUT("/v1/sandbox/requests/{request_id}")
    Response putRequest(@Path("request_id") String requestId, @Body SandboxRequestBody requestBody);

    /**
     * Used to simulate the possible responses the Request endpoint will return when requesting a particular product,
     * such as surge pricing, against the Sandbox.
     *
     * Accepts a JSON body indicating what you would like the surge_multiplier to be when making a Request to a particular Product.
     * @param productId Unique identifier representing a specific product for a given latitude & longitude. For example,
     *                  uberX in San Francisco will have a different product_id than uberX in Los Angeles.
     * @param sandboxProductBody Accepts a JSON body indicating what you would like the surge_multiplier to be when
     *                           making a Request to a particular Product.
     * @return Status-code: 204 Success
     */
    @PUT("/v1/sandbox/products/{product_id}")
    Response putProducts(@Path("product_id") String productId, @Body SandboxProductBody sandboxProductBody);
}
