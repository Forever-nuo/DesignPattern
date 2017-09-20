package com.forever.createPattern.singletonPattern;

/**
 * 懒汉模式
 * Created by Administrator on 2017/3/16.
 */
public class LazySingleObject {

    private int age = 1;
    private static LazySingleObject lazySingleObject; //一开始初始化的时候没有创建对象

    private LazySingleObject() {
    } //私有化构造函数

    public static LazySingleObject getInstance() {  //获得实例对象的方法
        if (null == lazySingleObject) {       //如果为空
            return lazySingleObject = new LazySingleObject();   //再创建
        }
        return lazySingleObject;    //不为空直接返回已存在的
    }

    public void showMsg() {
        System.out.println("我是懒汉模式" + age++);
    }
}
