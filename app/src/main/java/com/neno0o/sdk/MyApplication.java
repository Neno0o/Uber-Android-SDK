package com.neno0o.uber.android.sdk;

import com.neno0o.ubersdk.Uber;

public class MyApplication extends android.app.Application {

    @Override
    public void onCreate() {

        Uber.getInstance().init("CLIENT_ID",
                "CLIENT_SECRET",
                "SERVER_TOKEN",
                "REDIRECT_URL");
    }
}
