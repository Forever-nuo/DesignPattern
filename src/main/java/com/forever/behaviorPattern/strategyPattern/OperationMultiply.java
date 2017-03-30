package com.forever.behaviorPattern.strategyPattern;

/**
 * Created by forever on 2017-3-29.
 */
class OperationMultiply implements  Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1*num2;
    }
}
