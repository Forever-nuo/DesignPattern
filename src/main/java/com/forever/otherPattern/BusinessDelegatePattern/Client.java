package com.forever.otherPattern.BusinessDelegatePattern;

/**
 * Created by forever on 2017-3-30.
 */
public class Client {
    BusinessDelegate businessService;

    public Client(BusinessDelegate businessService){
        this.businessService  = businessService;
    }

    public void doTask(){
        businessService.doTask();
    }
}
