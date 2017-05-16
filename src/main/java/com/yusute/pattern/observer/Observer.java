package com.yusute.pattern.observer;

/**
 * Created by yusutehot on 5/16/2017.
 */
public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
