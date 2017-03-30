package com.forever.createPattern.builderPattern;

/**
 * 汉堡
 * 用纸包装
 * Created by Administrator on 2017/3/16.
 */
public abstract class Burger implements Item {
    public Packing packing() {
        return new WrapperPacking();
    }
}
