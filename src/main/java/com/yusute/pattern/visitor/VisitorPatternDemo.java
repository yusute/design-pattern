package com.yusute.pattern.visitor;

/**
 * Created by yusutehot on 5/16/2017.
 */
public class VisitorPatternDemo {
    public static void main(String[] args) {

        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());

        ComputerPart mouse = new Mouse();
        mouse.accept(new ComputerPartDisplayVisitor());

    }
}
