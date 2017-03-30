package com.forever.createPattern.singletonPattern;

/**
 * 枚举单汉模式
 * Created by Administrator on 2017/3/16.
 */
public enum  EnumSingleObject {
    INSTANCE;
    public void whateverMethod() {
    }

    public void showMsg(){
        System.out.println("枚举单汉模式.......");
    }
}
