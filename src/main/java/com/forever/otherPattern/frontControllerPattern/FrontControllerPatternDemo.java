package com.forever.otherPattern.frontControllerPattern;

/**
 * Created by forever on 2017-3-30.
 */
public class FrontControllerPatternDemo {
    public static void main(String[] args) {
        FrontController frontController = new FrontController();
        frontController.dispatchRequest("HOME");
        frontController.dispatchRequest("STUDENT");
    }
}
