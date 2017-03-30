package com.forever.behaviorPattern.responsebilityChainPattern;

/**
 * Created by forever on 2017-3-26.
 */
public class ConsoleLogger extends AbstractLogger {
    public ConsoleLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("标准的 控制台::记录器:" + message);
    }
}
