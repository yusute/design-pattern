package com.yusute.pattern.builder;

/**
 * Created by yusutehot on 5/16/2017.
 */
public class Pepsi extends ColdDrink {

    @Override
    public float price() {
        return 35.0f;
    }

    @Override
    public String name() {
        return "Pepsi";
    }
}
