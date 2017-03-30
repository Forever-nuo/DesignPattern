package com.forever.createPattern.singletonPattern;

/**
 * 饿汉模式  一开始就创建好对象
 * Created by Administrator on 2017/3/16.
 */
public class SingleObject {
    private static SingleObject singleObject = new SingleObject(); //创建好对象

    private SingleObject() {} //构造函数私有化  外界就不能通过new 创建对象

    public static SingleObject getInstance() { //设置成静态的  因为不能通过new创建对象  返回当前队形
        return singleObject;
    }

    public void  showMsg(){
        System.out.println("hello world!");
    }
}
