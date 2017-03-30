package com.forever.otherPattern.serviceLocatorPattern;

/**
 * Created by forever on 2017-3-30.
 */
public class Service2 implements  Service {
    public void execute(){
        System.out.println("Executing Service2");
    }

    @Override
    public String getName() {
        return "Service2";
    }
}
