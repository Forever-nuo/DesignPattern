package com.forever.createPattern.singletonPattern;

/**
 * 同步的懒汉模式
 * 1.线程安全
 * 2.懒加载的
 * Created by Administrator on 2017/3/16.
 */
public class SynchronizedSingle {
    private static SynchronizedSingle synchronizedSingle;

    private SynchronizedSingle() {
    }

    public static synchronized SynchronizedSingle getInstance() {
        if (null == synchronizedSingle) {
            return synchronizedSingle = new SynchronizedSingle();
        }
        return synchronizedSingle;
    }

    public void showMsg(){
        System.out.println("线程安全的懒汉模式......");
    }

}
