package com.forever.createPattern.builderPattern;

/**
 * 饮料 用瓶包装
 * Created by Administrator on 2017/3/16.
 */
public abstract class Drink implements  Item {
    public Packing packing() {
        return new BottlePacking();
    }
}
