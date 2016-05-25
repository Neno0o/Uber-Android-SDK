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
    private PriceDetails price_details;


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
        return price_details;
    }

    public void setPriceDetails(PriceDetails priceDetails) {
        this.price_details = priceDetails;
    }

    public class PriceDetails {

        /**
         * Array containing additional fees added to the price of a product.
         */
        @Expose
        @SerializedName("service_fees")
        private List<ServiceFees> service_fees;

        /**
         * The unit of distance used to calculate the fare (either mile or km).
         */
        @Expose
        @SerializedName("distance_unit")
        private String distance_unit;

        /**
         * The charge per minute (if applicable for the product type).
         */
        @Expose
        @SerializedName("cost_per_minute")
        private double cost_per_minute;

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
        private double cost_per_distance;

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
        private double cancellation_fee;

        /**
         * ISO 4217 currency code.
         */
        @Expose
        @SerializedName("currency_code")
        private String currency_code;


        public List<ServiceFees> getServiceFees() {
            return service_fees;
        }

        public void setServiceFees(List<ServiceFees> serviceFees) {
            this.service_fees = serviceFees;
        }

        public String getDistanceUnit() {
            return distance_unit;
        }

        public void setDistanceUnit(String distanceUnit) {
            this.distance_unit = distanceUnit;
        }

        public double getCostPerMinute() {
            return cost_per_minute;
        }

        public void setCostPerMinute(double costPerMinute) {
            this.cost_per_minute = costPerMinute;
        }

        public double getMinimum() {
            return minimum;
        }

        public void setMinimum(double minimum) {
            this.minimum = minimum;
        }

        public double getCostPerDistance() {
            return cost_per_distance;
        }

        public void setCostPerDistance(double costPerDistance) {
            this.cost_per_distance = costPerDistance;
        }

        public double getBase() {
            return base;
        }

        public void setBase(double base) {
            this.base = base;
        }

        public double getCancellationFee() {
            return cancellation_fee;
        }

        public void setCancellationFee(double cancellationFee) {
            this.cancellation_fee = cancellationFee;
        }

        public String getCurrencyCode() {
            return currency_code;
        }

        public void setCurrencyCode(String currencyCode) {
            this.currency_code = currencyCode;
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
