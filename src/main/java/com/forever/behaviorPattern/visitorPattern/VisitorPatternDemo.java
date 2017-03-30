package com.forever.behaviorPattern.visitorPattern;

/**
 * Created by forever on 2017-3-29.
 */
public class VisitorPatternDemo {
    public static void main(String[] args) {

        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}
