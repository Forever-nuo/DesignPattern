package com.forever.createPattern.singletonPattern;

/**
 * Created by Administrator on 2017/3/16.
 */
public class SinglePatternDemo {
    public static void main(String[] args) {
        //饿汉模式
        // SingleObject.getInstance().showMsg();

        //第一次获取 懒汉模式
        LazySingleObject lazySingleObject1 = LazySingleObject.getInstance();
        lazySingleObject1.showMsg();

        //第二次获取 懒汉
        LazySingleObject lazySingleObject2 = LazySingleObject.getInstance();
        lazySingleObject2.showMsg();

        //静态内部类单汉模式
        StaticInnerSingle.getInstance().showMsg();

        //枚举单汉模式
        EnumSingleObject.INSTANCE.showMsg();

        //双重锁单汉模式
        DoubleLockSingle.getInstance().showMsg();

    }
}
