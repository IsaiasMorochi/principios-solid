package com.isaias.solid.v2.ocp.con_ocp.impl;

import com.isaias.solid.v2.ocp.con_ocp.IDiscount;

public class GoldDiscount implements IDiscount {
    @Override
    public Double apply(Double price) {
        return price * 0.5;
    }
}
