package com.forever.behaviorPattern.NullObjectPattern;

/**
 * Created by forever on 2017-3-29.
 */
public class RealCustomer extends AbstractCustomer {
    public RealCustomer(String name) {
        this.name = name;
    }

    @Override
    protected boolean IsNUll() {
        return false;
    }

    @Override
    protected String getName() {
        return name;
    }
}
