package com.forever.createPattern.singletonPattern;

/**
 * 双重锁单汉模式
 * 1.是否 Lazy 初始化：是
 * 2.是否多线程安全：是
 * 3.实现难度：较复杂
 * Created by Administrator on 2017/3/16.
 */
public class DoubleLockSingle {
    private static volatile DoubleLockSingle doubleLockSingle;

    private DoubleLockSingle() {
    }

    public static DoubleLockSingle getInstance() {
        if (null == doubleLockSingle) {
            synchronized (DoubleLockSingle.class) {
                if (null == doubleLockSingle) {
                    doubleLockSingle = new DoubleLockSingle();
                }
            }
        }
        return doubleLockSingle;
    }

    public  void showMsg(){
        System.out.println("双重锁单汉模式......");
    }

}
