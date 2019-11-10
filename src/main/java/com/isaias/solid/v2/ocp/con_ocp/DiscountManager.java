package com.isaias.solid.v2.ocp.con_ocp;

public class DiscountManager {

    public Double apply(Double price, IDiscount discount) {
        return discount.apply(price);
    }

}
