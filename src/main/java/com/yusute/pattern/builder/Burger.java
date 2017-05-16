package com.yusute.pattern.builder;

/**
 * Created by yusutehot on 5/16/2017.
 */
public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
