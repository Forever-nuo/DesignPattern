package com.forever.behaviorPattern.NullObjectPattern;

/**
 * Created by forever on 2017-3-29.
 */
public class NullObjectPatternDemo {
    public static void main(String[] args) {
        AbstractCustomer customer1 = CustomerFactory.getCustomerByName("jack");
        AbstractCustomer customer2 = CustomerFactory.getCustomerByName("marry");
        AbstractCustomer customer3 = CustomerFactory.getCustomerByName("angel");
        AbstractCustomer customer4 = CustomerFactory.getCustomerByName("kite");

        System.out.println(customer1.getName());
        System.out.println(customer2.getName());
        System.out.println(customer3.getName());
        System.out.println(customer4.getName());

    }
}
