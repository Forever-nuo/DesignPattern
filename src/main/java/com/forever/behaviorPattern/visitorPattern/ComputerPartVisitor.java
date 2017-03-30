package com.forever.behaviorPattern.visitorPattern;



/**
 * Created by forever on 2017-3-29.
 */
public interface ComputerPartVisitor {
    public void visit(Computer computer);
    public void visit(Mouse mouse);
    public void visit(Keyboard keyboard);
    public void visit(Monitor monitor);
}
