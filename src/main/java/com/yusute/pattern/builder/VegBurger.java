package com.yusute.pattern.builder;

/**
 * Created by yusutehot on 5/16/2017.
 */
public class VegBurger extends Burger {

    @Override
    public float price() {
        return 25.0f;
    }

    @Override
    public String name() {
        return "Veg Burger";
    }
}