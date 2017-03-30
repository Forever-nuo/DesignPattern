package com.forever.createPattern.builderPattern;

/**
 * 条目
 * 价格
 * 名称
 * 使用的什么包装
 * Created by Administrator on 2017/3/16.
 */
public interface Item {
    String name(); //名称
    Float price(); //价格
    Packing packing();//包装
}
