package com.neno0o.ubersdk.endpoints.service;

import com.neno0o.ubersdk.endpoints.models.prices.Prices;
import com.neno0o.ubersdk.endpoints.models.products.Product;
import com.neno0o.ubersdk.endpoints.models.products.Products;
import com.neno0o.ubersdk.endpoints.models.promotions.Promotion;
import com.neno0o.ubersdk.endpoints.models.requests.estimaterequest.UberEstimateBody;
import com.neno0o.ubersdk.endpoints.models.requests.estimaterequest.UberEstimateRequest;
import com.neno0o.ubersdk.endpoints.models.requests.maprequest.UberMapRequest;
import com.neno0o.ubersdk.endpoints.models.requests.receiptrequest.UberReceiptRequest;
import com.neno0o.ubersdk.endpoints.models.requests.UberRequest;
import com.neno0o.ubersdk.endpoints.models.requests.UberRequestBody;
import com.neno0o.ubersdk.endpoints.models.times.Times;
import com.neno0o.ubersdk.endpoints.models.useractivity.UserActivity;
import com.neno0o.ubersdk.endpoints.models.userprofile.User;

import retrofit.Callback;
import retrofit.client.Response;
import retrofit.http.Body;
import retrofit.http.DELETE;
import retrofit.http.GET;
import retrofit.http.POST;
import retrofit.http.Path;
import retrofit.http.Query;

public interface UberAPIService {

    /**
     * Applications will only use the Products, Price Estimates, and Time Estimates endpoints.
     * For these, you only need to use the server_token to access resources via the API Token Authentication.
     *
     * If your application will access resources on behalf of an Uber user, such as with the Me and User Activity endpoints,
     * you will need to follow the three-legged OAuth 2.0 flow in order to obtain an access_token.
     */

    /**
     * The Products endpoint returns information about the Uber products offered at a given location. The response
     * includes the display name and other details about each product, and lists the products in the proper
     * display order.
     *
     * @param latitude Latitude component of location.
     * @param longitude Longitude component of location.
     * @return products
     */
    @GET("/v1/products")
    Products getProducts(@Query("latitude") double latitude,
                         @Query("longitude") double longitude);

    /**
     * @see #getProducts(double, double)
     */
    @GET("/v1/products")
    void getProducts(@Query("latitude") double latitude,
                     @Query("longitude") double longitude,
                     Callback<Products> productsCallback);

    /**
     *
     * @param productId Unique identifier representing a specific product for a given latitude & longitude.
     *                  For example, uberX in San Francisco will have a different product_id than uberX in Los Angeles.
     * @return Product
     */
    @GET("/v1/products/{product_id}")
    Product getProduct(@Query("product_id") String productId);

    /**
     *
     * @see #getProduct(String)
     */
    @GET("/v1/products/{product_id}")
    void getProduct(@Query("product_id") String productId,
                    Callback<Product> productCallback);



    /**
     * The Price Estimates endpoint returns an estimated price range for each product offered at a given location.
     * The price estimate is provided as a formatted string with the full price range and the localized currency
     * symbol.
     *
     * @param startLatitude Latitude component of start location.
     * @param startLongitude Longitude component of start location.
     * @param endLatitude Latitude component of end location.
     * @param endLongitude Longitude component of end location.
     * @return Prices
     */
    @GET("/v1/estimates/price")
    Prices getPriceEstimates(@Query("start_latitude") double startLatitude,
                             @Query("start_longitude") double startLongitude,
                             @Query("end_latitude") double endLatitude,
                             @Query("end_longitude") double endLongitude);

    /**
     * @see #getPriceEstimates(double, double, double, double)
     */
    @GET("/v1/estimates/price")
    void getPriceEstimates(@Query("start_latitude") double startLatitude,
                           @Query("start_longitude") double startLongitude,
                           @Query("end_latitude") double endLatitude,
                           @Query("end_longitude") double endLongitude,
                           Callback<Prices> productsCallback);


    /**
     * The Time Estimates endpoint returns ETAs for all products offered at a given location, with the responses
     * expressed as integers in seconds. We recommend that this endpoint be called every minute to provide the
     * most accurate, up-to-date ETAs.
     *
     * @param startLatitude Latitude component.
     * @param startLongitude Longitude component.
     * @param customerUUID (optional) Unique customer identifier to be used for experience customization.
     * @param productId (optional) Unique identifier representing a specific product for a given latitude & longitude.
     * @return Times
     */
    @GET("/v1/estimates/time")
    Times getTimeEstimates(@Query("start_latitude") double startLatitude,
                           @Query("start_longitude") double startLongitude,
                           @Query("customer_uuid") String customerUUID,
                           @Query("product_id") String productId);

    /**
     * @see #getTimeEstimates(double, double, String, String)
     */
    @GET("/v1/estimates/time")
    void getTimeEstimates(@Query("start_latitude") double startLatitude,
                          @Query("start_longitude") double startLongitude,
                          @Query("customer_uuid") String customerUUID,
                          @Query("product_id") String productId,
                          Callback<Times> timesCallback);

    /**
     *
     * @param startLatitude Latitude component.
     * @param startLongitude Longitude component.
     * @return Times
     */
    @GET("/v1/estimates/time")
    Times getTimeEstimates(@Query("start_latitude") double startLatitude,
                           @Query("start_longitude") double startLongitude);

    /**
     * @see #getTimeEstimates(double, double)
     */
    @GET("/v1/estimates/time")
    void getTimeEstimates(@Query("start_latitude") double startLatitude,
                          @Query("start_longitude") double startLongitude,
                          Callback<Times> timesCallback);


    /**
     * The Promotions endpoint returns information about the promotion that will be available to a
     * new user based on their activity's location. These promotions do not apply for existing users.
     *
     * @param startLatitude Latitude component of start location.
     * @param startLongitude Longitude component of start location.
     * @param endLatitude Latitude component of end location.
     * @param endLongitude Longitude component of end location.
     * @return Promotion
     */
    @GET("/v1/promotions")
    Promotion getPromotions(@Query("start_latitude") double startLatitude,
                            @Query("start_longitude") double startLongitude,
                            @Query("end_latitude") double endLatitude,
                            @Query("end_longitude") double endLongitude);

    /**
     * @see #getPromotions(double, double, double, double)
     */
    @GET("/v1/promotions")
    void getPromotions(@Query("start_latitude") double startLatitude,
                       @Query("start_longitude") double startLongitude,
                       @Query("end_latitude") double endLatitude,
                       @Query("end_longitude") double endLongitude,
                       Callback<Promotion> promotionCallback);


    /**
     * The User Profile endpoint returns information about the Uber user that has authorized with the application.
     *
     * @return UserProfile
     */
    @GET("/v1/me")
    User getMe();
    /**
     * @see #getMe()
     */
    @GET("/v1/me")
    void getMe(Callback<User> userProfileCallback);



    /**
     * The User Activity endpoint returns a limited amount of data about a user's lifetime activity with Uber.
     * The response will include pickup and dropoff times, the distance of past requests, and information about
     * which products were requested.
     * The history array in the response will have a maximum length based on the limit parameter.
     * The response value count may exceed limit, therefore subsequent API requests may be necessary.
     *
     * @param offset Offset the list of returned results by this amount. Default is zero.
     * @param limit Number of items to retrieve. Default is 5, maximum is 50.
     * @return UserActivity
     */
    @GET("/v1.2/history")
    UserActivity getUserActivity(@Query("offset") Integer offset, @Query("limit") Integer limit);

    /**
     * @see #getUserActivity(Integer, Integer)
     */
    @GET("/v1.2/history")
    void getUserActivity(@Query("offset") Integer offset, @Query("limit") Integer limit, Callback<UserActivity> callback);



    /**
     * The Request endpoint allows a ride to be requested on behalf of an Uber user given their desired product,
     * start, and end locations.
     *
     * Please review the Sandbox documentation on how to develop and test against these endpoints without making
     * real-world Requests and being charged.
     *
     * @param uberRequestBody
     * @return
     */
    @POST("/v1/requests")
    UberRequest postRequest(@Body UberRequestBody uberRequestBody);


    @POST("/v1/requests")
    void postRequest(@Body UberRequestBody uberRequestBody, Callback<UberRequest> callback);


    /**
     * Get the real time status of an ongoing trip that was created using the Ride Request endpoint.
     *
     * @param requestId Unique identifier representing a Request.
     * @return UberRequest
     */
    @GET("/v1/requests/{request_id}")
    UberRequest getRequestDetails(@Path("request_id") String requestId);

    /**
     *@see #getRequestDetails(String)
     */
    @GET("/v1/requests/{request_id}")
    void getRequestDetails(@Path("request_id") String requestId, Callback<UberRequest> callback);


    /**
     * The Request Estimate endpoint allows a ride to be estimated given the desired product, start, and end locations.
     * If the end location is not provided, only the pickup ETA and details of surge pricing information are provided.
     * If the pickup ETA is null, there are no cars available, but an estimate may still be given to the user.
     *
     * You can use this endpoint to determine if surge pricing is in effect.
     * Do this before attempting to make a request so that you can preemptively have a user confirm surge
     * by sending them to the surge_confirmation_href provided in the response.
     *
     * @param uberEstimateBody
     * @return
     */

    @POST("/v1/requests/estimate")
    UberEstimateRequest postEstimateRequest(@Body UberEstimateBody uberEstimateBody);


    @POST("/v1/requests/estimate")
    void postEstimateRequest(@Body UberEstimateBody uberEstimateBody, Callback<UberEstimateRequest> callback);



    /**
     * Cancel an ongoing Request on behalf of a rider
     *
     * @param requestId Unique identifier representing a Request.
     * @return
     */
    @DELETE("/v1/requests/{request_id}")
    Response deleteRequest(@Path("request_id") String requestId);

    /**
     * @see #deleteRequest(String)
     */
    @DELETE("/v1/requests/{request_id}")
    void deleteRequest(@Path("request_id") String requestId, Callback<Response> callback);


    /**
     * Get a map with a visual representation of a Request.
     *
     * @param requestId Unique identifier representing a Request.
     * @return
     */
    @GET("/v1/requests/{request_id}/map")
    UberMapRequest getMapRequest(@Path("request_id") String requestId);

    @GET("/v1/requests/{request_id}/map")
    void getMapRequest(@Path("request_id") String requestId, Callback<UberMapRequest> callback);


    /**
     * Get the receipt information of the completed request.
     *
     * @param requestId Unique identifier representing a Request.
     * @return
     */
    @GET("/v1/requests/{request_id}/receipt")
    UberReceiptRequest getReceiptRequest(@Path("request_id") String requestId);

    @GET("/v1/requests/{request_id}/receipt")
    void getReceiptRequest(@Path("request_id") String requestId, Callback<UberReceiptRequest> callback);
}
