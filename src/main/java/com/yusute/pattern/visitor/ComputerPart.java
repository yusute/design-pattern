package com.yusute.pattern.visitor;

/**
 * Created by yusutehot on 5/16/2017.
 */
public interface ComputerPart {
    void accept(ComputerPartVisitor computerPartVisitor);
}
