package com.yusute.pattern.visitor;

/**
 * Created by yusutehot on 5/16/2017.
 */
public class Monitor  implements ComputerPart {

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
