# Uber SDK for Android (Beta)
An unofficial Uber SDK for Android (Beta). 
This open-source library allows you to integrate Uber into your Android app.

Learn more about about Uber API, documentation, samples, and more at https://developer.uber.com/

# Features
- Rides By Uber Button
- Authentication
- User Profile
- User History
- Request By Uber
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
compile 'com.neno0o.ubersdk:ubersdk:0.1'
```

Maven:

```xml
<dependency>
  <groupId>com.neno0o.ubersdk</groupId>
  <artifactId>ubersdk</artifactId>
  <version>0.1</version>
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
