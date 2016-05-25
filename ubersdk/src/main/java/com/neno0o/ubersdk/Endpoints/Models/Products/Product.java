package com.neno0o.ubersdk.Endpoints.Models.Products;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Product {

    /**
     * Unique identifier representing a specific product for a given latitude & longitude.
     * For example, uberX in San Francisco will have a different product_id than uberX in Los Angeles.
     */
    @Expose
    @SerializedName("product_id")
    private String productId;

    /**
     * Description of product.
     */
    @Expose
    @SerializedName("description")
    private String description;

    /**
     * Display name of product.
     */
    @Expose
    @SerializedName("display_name")
    private String displayName;

    /**
     * Capacity of product. For example, 4 people.
     */
    @Expose
    @SerializedName("capacity")
    private int capacity;

    /**
     * Image URL representing the product.
     */
    @Expose
    @SerializedName("image")
    private String image;

    /**
     * The basic price details (not including any surge pricing adjustments).
     * If null, the price is a metered fare such as a taxi service.
     */
    @Expose
    @SerializedName("price_details")
    private PriceDetails priceDetails;


    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public PriceDetails getPriceDetails() {
        return priceDetails;
    }

    public void setPriceDetails(PriceDetails price_details) {
        this.priceDetails = price_details;
    }

    public class PriceDetails {

        /**
         * Array containing additional fees added to the price of a product.
         */
        @Expose
        @SerializedName("service_fees")
        private List<ServiceFees> serviceFees;

        /**
         * The unit of distance used to calculate the fare (either mile or km).
         */
        @Expose
        @SerializedName("distance_unit")
        private String distanceUnit;

        /**
         * The charge per minute (if applicable for the product type).
         */
        @Expose
        @SerializedName("cost_per_minute")
        private double costPerMinute;

        /**
         * The minimum price of a trip.
         */
        @Expose
        @SerializedName("minimum")
        private double minimum;

        /**
         * The charge per distance unit (if applicable for the product type).
         */
        @Expose
        @SerializedName("cost_per_distance")
        private double costPerDistance;

        /**
         * The base price.
         */
        @Expose
        @SerializedName("base")
        private double base;

        /**
         * The fee if a rider cancels the trip after the grace period.
         */
        @Expose
        @SerializedName("cancellation_fee")
        private double cancellationFee;

        /**
         * ISO 4217 currency code.
         */
        @Expose
        @SerializedName("currency_code")
        private String currencyCode;


        public List<ServiceFees> getServiceFees() {
            return serviceFees;
        }

        public void setServiceFees(List<ServiceFees> service_fees) {
            this.serviceFees = service_fees;
        }

        public String getDistanceUnit() {
            return distanceUnit;
        }

        public void setDistanceUnit(String distance_unit) {
            this.distanceUnit = distance_unit;
        }

        public double getCostPerMinute() {
            return costPerMinute;
        }

        public void setCostPerMinute(double cost_per_minute) {
            this.costPerMinute = cost_per_minute;
        }

        public double getMinimum() {
            return minimum;
        }

        public void setMinimum(double minimum) {
            this.minimum = minimum;
        }

        public double getCostPerDistance() {
            return costPerDistance;
        }

        public void setCostPerDistance(double cost_per_distance) {
            this.costPerDistance = cost_per_distance;
        }

        public double getBase() {
            return base;
        }

        public void setBase(double base) {
            this.base = base;
        }

        public double getCancellationFee() {
            return cancellationFee;
        }

        public void setCancellationFee(double cancellation_fee) {
            this.cancellationFee = cancellation_fee;
        }

        public String getCurrencyCode() {
            return currencyCode;
        }

        public void setCurrencyCode(String currency_code) {
            this.currencyCode = currency_code;
        }

        public class ServiceFees {

            /**
             * The amount of the service fee.
             */
            @Expose
            @SerializedName("fee")
            private double fee;

            /**
             * The name of the service fee.
             */
            @Expose
            @SerializedName("name")
            private String name;

            public double getFee() {
                return fee;
            }

            public void setFee(double fee) {
                this.fee = fee;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
        }
    }
}
