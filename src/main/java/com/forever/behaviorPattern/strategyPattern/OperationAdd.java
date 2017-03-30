package com.forever.behaviorPattern.strategyPattern;

/**
 * 加法运算
 * Created by forever on 2017-3-29.
 */

public class OperationAdd implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1+num2;
    }
}
