package com.forever.otherPattern.interceptingFilterPattern;

/**
 * Created by forever on 2017-3-30.
 */
public class Target {
    public void execute(String request){
        System.out.println("Executing request: " + request);
    }
}
