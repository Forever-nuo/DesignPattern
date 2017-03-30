package com.forever.behaviorPattern.responsebilityChainPattern;

/**
 * Created by forever on 2017-3-26.
 */
public class patternDemo {
    private static AbstractLogger getChainOfLoggers() {
        //初始化责任链
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);//最高等级
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);
        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);
        return errorLogger;
    }

    public static void main(String[] args) {
        AbstractLogger loggerChain = getChainOfLoggers();
        loggerChain.logMessage(AbstractLogger.INFO,"这是一个信息");
        loggerChain.logMessage(AbstractLogger.DEBUG,"这是一个debug级的信息信息");
        loggerChain.logMessage(AbstractLogger.ERROR,"这是一个error级的信息信息");
    }
}
