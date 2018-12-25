package com.neno0o.ubersdk.Endpoints.Models.Products;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Products {

    @Expose
    @SerializedName("products")
    private List<Product> productsList;

    public List<Product> getProducts() {
        return productsList;
    }

    public void setProducts(List<Product> products) {
        this.productsList = products;
    }
}
