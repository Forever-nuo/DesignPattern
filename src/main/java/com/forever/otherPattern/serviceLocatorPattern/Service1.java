package com.forever.otherPattern.serviceLocatorPattern;

/**
 * Created by forever on 2017-3-30.
 */
public class Service1 implements  Service {
    @Override
    public String getName() {
        return "Service1";
    }

    @Override
    public void execute() {
        System.out.println("Executing Service1");
    }
}
