package com.forever.otherPattern.interceptingFilterPattern;

/**
 * Created by forever on 2017-3-30.
 */
public class DebugFilter implements Filter {
    @Override
    public void execute(String request) {
        System.out.println("request log: " + request);
    }
}
