package com.forever.behaviorPattern.responsebilityChainPattern;

/**
 * Created by forever on 2017-3-26.
 */
public class FileLogger extends AbstractLogger {
    public FileLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("文件 控制台::记录器:" + message);
    }
}
