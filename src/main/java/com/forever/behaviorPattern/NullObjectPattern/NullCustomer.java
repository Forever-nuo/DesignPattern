package com.forever.behaviorPattern.NullObjectPattern;

/**
 * Created by forever on 2017-3-29.
 */
public class NullCustomer extends AbstractCustomer {
    @Override
    protected boolean IsNUll() {
        return true;
    }

    @Override
    protected String getName() {
        return "是空用户";
    }
}
