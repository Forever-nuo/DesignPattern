package com.forever.otherPattern.BusinessDelegatePattern;

/**
 * Created by forever on 2017-3-30.
 */
public class BusinessLookUp {
    public BusinessService getBusinessService(String serviceType){
        if(serviceType.equalsIgnoreCase("EJB")){
            return new EJBService();
        }else {
            return new JMSService();
        }
    }
}
