package com.forever.createPattern.singletonPattern;

/**
 * 1. 是否 Lazy 初始化：是
 * 2.是否多线程安全：是
 * 3.实现难度：一般
 * Created by Administrator on 2017/3/16.
 */
public class StaticInnerSingle {
    private static class SingletonHolder {
        private static final StaticInnerSingle INSTANCE = new StaticInnerSingle();
    }

    private StaticInnerSingle() {
    }

    public static final StaticInnerSingle getInstance() {
        return SingletonHolder.INSTANCE;
    }

    public void showMsg() {
        System.out.println("静态内部类单汉模式!");
    }

}
