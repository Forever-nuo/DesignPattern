package com.forever.behaviorPattern.visitorPattern;

/**
 * Created by forever on 2017-3-29.
 */
public interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
}
