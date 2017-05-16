package com.yusute.pattern.strategy;

/**
 * Created by yusutehot on 5/16/2017.
 */
public class OperationMultiply implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }
}
