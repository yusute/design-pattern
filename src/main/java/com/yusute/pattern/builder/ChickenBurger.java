package com.yusute.pattern.builder;

/**
 * Created by yusutehot on 5/16/2017.
 */
public class ChickenBurger extends Burger {

    @Override
    public float price() {
        return 50.5f;
    }

    @Override
    public String name() {
        return "Chicken Burger";
    }
}
