package com.isaias.solid.v2.ocp.sin_ocp;

public class DiscountManager {

    public Double apply(Double price, Discount discount) {
        return discount.apply(price);
    }

    public Double apply(Double price, GoldDiscount discount) {
        return discount.apply(price);
    }

    public Double apply(Double price, BlackFriday discount) {
        return discount.apply(price);
    }

}
