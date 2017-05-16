package com.yusute.pattern.interpreter;

/**
 * Created by yusutehot on 5/16/2017.
 */
public interface Expression {
    boolean interpret(String context);
}