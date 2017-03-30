package com.forever.otherPattern.interceptingFilterPattern;

/**
 * Created by forever on 2017-3-30.
 */
public class Client {
    FilterManager filterManager;

    public void setFilterManager(FilterManager filterManager){
        this.filterManager = filterManager;
    }

    public void sendRequest(String request){
        filterManager.filterRequest(request);
    }
}
