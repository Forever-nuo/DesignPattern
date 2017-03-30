package com.forever.behaviorPattern.visitorPattern;

/**
 * Created by forever on 2017-3-29.
 */
public class Mouse implements  ComputerPart {
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
