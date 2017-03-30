package com.forever.behaviorPattern.responsebilityChainPattern;

/**
 * Created by forever on 2017-3-26.
 */
public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("错误 控制台::记录器:" + message);
    }
}
