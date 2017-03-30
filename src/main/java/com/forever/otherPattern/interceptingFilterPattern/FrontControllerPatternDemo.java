package com.forever.otherPattern.interceptingFilterPattern;

/**
 * Created by forever on 2017-3-30.
 */
public class FrontControllerPatternDemo {
    public static void main(String[] args) {
        FilterManager filterManager = new FilterManager(new Target());
        filterManager.setFilter(new AuthenticationFilter());
        filterManager.setFilter(new DebugFilter());

        Client client = new Client();
        client.setFilterManager(filterManager);
        client.sendRequest("HOME");
    }
}
