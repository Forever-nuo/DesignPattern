package com.forever.otherPattern.interceptingFilterPattern;

/**
 * Created by forever on 2017-3-30.
 */
public class AuthenticationFilter implements Filter {
    @Override
    public void execute(String request){
        System.out.println("Authenticating request: " + request);
    }
}
