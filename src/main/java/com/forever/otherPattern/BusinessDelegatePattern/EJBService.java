package com.forever.otherPattern.BusinessDelegatePattern;

/**
 * Created by forever on 2017-3-30.
 */
public class EJBService implements BusinessService {
    @Override
    public void doProcessing() {
        System.out.println("Processing task by invoking EJB Service");
    }
}
