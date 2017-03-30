package com.forever.behaviorPattern.responsebilityChainPattern;

/**
 * Created by forever on 2017-3-26.
 */
public abstract class AbstractLogger {
    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;

    protected int level; //记录器的等级

    protected AbstractLogger nextLogger;    //责任下一个记录器    聚合他自己

    public void  setNextLogger(AbstractLogger nextLogger){ //设置责任链中的下一个 记录器
        this.nextLogger = nextLogger;
    }

    protected  abstract  void write(String message);

    public  void logMessage(int level,String message){
        if(this.level<=level){
            write(message);
        }
        if(nextLogger!=null){
            nextLogger.logMessage(level,message);
        }
    }


}
