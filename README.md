# Uber SDK for Android (Beta)
An unofficial Uber SDK for Android (Beta). 
This open-source library allows you to integrate Uber into your Android app.

Learn more about about Uber API, documentation, samples, and more at https://developer.uber.com/

# Features
- Rides By Uber Button
- Authorization
- User Profile
- User History
- Make a Request
- Request Estimation
- Request Cancellation
- Request Map
- Request Receipt
- Uber Products
- Price Estimation
- Time Estimation
- Promotions
- Sandbox 

# Download

Gradle:

```groovy
compile 'com.neno0o.ubersdk:ubersdk:0.2'
```

Maven:

```xml
<dependency>
  <groupId>com.neno0o.ubersdk</groupId>
  <artifactId>ubersdk</artifactId>
  <version>0.2</version>
  <type>aar</type>
</dependency>
```

# Usage

First, navigate over to https://developer.uber.com/, and sign up for an Uber developer account.

**Initialize Uber**

Call `Uber.getInstance().init` from the onCreate method of your Application class to set your client id, client secert, server token and redirect url:

``` java
Uber.getInstance().init("CLIENT_ID",
                "CLIENT_SECRET",
                "SERVER_TOKEN",
                "REDIRECT_URL");
```

**Rides By Uber Button**

Use this widget or use your own button

```xml
<com.neno0o.ubersdk.Widgets.UberButton
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:id="@+id/uberBtn"
        android:layout_centerVertical="true"
        android:layout_centerHorizontal="true"/>
```

**User Authorization**

If your application will access resources on behalf of an Uber user, such as with the Me and User Activity endpoints, you will need to follow the three-legged OAuth 2.0 flow in order to obtain an access_token.

Manifest.xml in Application tag

```xml
<activity android:name="com.neno0o.ubersdk.Activites.Authentication" />
```

``` java
UberButton uberButton = (UberButton) findViewById(R.id.uberBtn);
uberButton.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent intent = new Intent(MainActivity.this, Authentication.class);
        startActivityForResult(intent, UBER_AUTHENTICATION);
    }
});
```
This will give you the access_token expires in 30 days. Call `onActivityResult`

``` java
@Override
protected void onActivityResult(int requestCode, int resultCode, Intent data) {
    if (requestCode == UBER_AUTHENTICATION) {
        // you have now access token
        // you can access resources on behalf of an Uber use
    }
}
```
**User Profile (Authorization Required)**

To return information about the Uber user that has authorized with the application.

``` java
Uber.getInstance().getUberAPIService().getMe(new Callback<User>() {
    @Override
    public void success(User user, Response response) {
        Log.d("user", user.getFirstName());
    }
});
```

**User History v1.2 (Authorization Required)**

To returns a limited amount of data about a user's lifetime activity with Uber.

``` java
Uber.getInstance().getUberAPIService().getUserActivity(offset, limit, new Callback<UserActivity>() {
    @Override
    public void success(UserActivity userActivity, Response response) {
    
    }
});
```

**Make a request (Authorization Required)**

Allowing a ride to be requested on behalf of an Uber user given their desired product, start, and end locations.

``` java
UberRequestBody uberRequestBody = new UberRequestBody(productId,
        startLatitude,
        startLongitude,
        endLatitude,
        endLongitude,
        surgeConfirmationId);
        
Uber.getInstance().getUberAPIService().postRequest(uberRequestBody, new Callback<UberRequest>() {
    @Override
    public void success(UberRequest uberRequest, Response response) {

    }
});
```
**Request Estimation (Authorization Required)**

Allowing a ride to be estimated given the desired product, start, and end locations.

``` java
UberEstimateBody uberEstimateBody = new UberEstimateBody(productId,
        startLatitude,
        startLongitude,
        endLatitude,
        endLongitude);
        
Uber.getInstance().getUberAPIService().postEstimateRequest(uberEstimateBody, new Callback<UberEstimateRequest>() {
    @Override
    public void success(UberEstimateRequest uberEstimateRequest, Response response) {

    }
});
```

**Request Cancellation (Authorization Required)**

Cancel an ongoing Request on behalf of a rider.

``` java
Uber.getInstance().getUberAPIService().deleteRequest(requestId);
```

**Request Map (Authorization Required)**

Get a map with a visual representation of a Request.

``` java
Uber.getInstance().getUberAPIService().getMapRequest(requestId);
```

**Request Receipt (Authorization Required)**

Get the receipt information of the completed request.

``` java
Uber.getInstance().getUberAPIService().getReceiptRequest(requestId, new Callback<UberReceiptRequest>() {
    @Override
    public void success(UberReceiptRequest uberReceiptRequest, Response response) {
                
    }
});
```

**Uber Products**

Returns information about the Uber products offered at a given location.

``` java
Uber.getInstance().getUberAPIService().getProducts(latitude, longitude, new Callback<Products>() {
    @Override
    public void success(Products products, Response response) {
        Log.d("Product", products.getProducts().get(0).getDisplayName());
    }
});
```

**Price Estimation**

Returns an estimated price range for each product offered at a given location.

``` java
Uber.getInstance().getUberAPIService().getPriceEstimates(start_latitude,
      start_longitude,
      end_latitude,
      end_longitude,
      new Callback<Prices>() {
      @Override
      public void success(Prices prices, Response response) {
                        
      }
});
```

**Time Estimation**

Returns ETAs for all products offered at a given location.

``` java
Uber.getInstance().getUberAPIService().getTimeEstimates(start_latitude, start_longitude);
```

**Promotions**

The Promotions endpoint returns information about the promotion that will be available to a new user based on their activity's location

``` java
Uber.getInstance().getUberAPIService().getPromotions(startLatitude, startLongitude, endLatitude, endLongitude);
```

# Contributing

All pull requests are welcome. If you would like to contribute code you can do so through GitHub by forking the repository and sending a pull request.

When submitting code, please make every effort to follow existing conventions and style in order to keep the code as readable as possible.

# Todo

- Style More Buttons
- Unit Testing
- Validation

# Licence

    Copyright 2015 Neno0o

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at
    
       http://www.apache.org/licenses/LICENSE-2.0
    
    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
