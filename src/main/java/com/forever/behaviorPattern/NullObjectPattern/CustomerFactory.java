package com.forever.behaviorPattern.NullObjectPattern;

/**
 * Created by forever on 2017-3-29.
 */
public class CustomerFactory {
    private static final String[] NAMES = {"jack", "angel", "kite"};

    public static AbstractCustomer getCustomerByName(String name) {
        for (String s : NAMES) {
            if (s.equals(name)) {
                return new RealCustomer(s);
            }
        }
        return new NullCustomer();
    }
}
