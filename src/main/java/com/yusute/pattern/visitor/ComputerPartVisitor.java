package com.yusute.pattern.visitor;

/**
 * Created by yusutehot on 5/16/2017.
 */
public interface ComputerPartVisitor {
    void visit(Computer computer);

    void visit(Mouse mouse);

    void visit(Keyboard keyboard);

    void visit(Monitor monitor);
}
