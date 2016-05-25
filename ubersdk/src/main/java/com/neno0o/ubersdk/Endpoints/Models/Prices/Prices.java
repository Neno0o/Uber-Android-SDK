package com.neno0o.ubersdk.Endpoints.Models.Prices;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Prices {

    @Expose
    @SerializedName("prices")
    private List<Price> pricesList;

    public List<Price> getPrices() {
        return pricesList;
    }

    public void setPrices(List<Price> prices) {
        this.pricesList = prices;
    }
}
