package com.forever.createPattern.builderPattern;

/**
 * name:鸡肉汉堡
 * 价格:30元
 * Created by Administrator on 2017/3/16.
 */
public class ChickenBurger extends Burger {
    public String name() {
        return "鸡肉汉堡...";
    }

    public Float price() {
        return 30.0f;
    }
}
