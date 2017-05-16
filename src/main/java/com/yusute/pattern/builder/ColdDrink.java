package com.yusute.pattern.builder;

/**
 * Created by yusutehot on 5/16/2017.
 */
public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
