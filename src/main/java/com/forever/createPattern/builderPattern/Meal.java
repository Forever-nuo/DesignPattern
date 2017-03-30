package com.forever.createPattern.builderPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 1.添加item的方法
 * 2.计算总共价格的方法
 * 3.显示item的方法:1.显示价格 2.显示名称 3.显示包装
 * Created by Administrator on 2017/3/16.
 */
public class Meal {
    private List<Item> items = new ArrayList<Item>();

    /**
     * 添加食物
     * @param item
     * @return
     */
    public List<Item> addItem(Item item) {
        items.add(item);
        return items;
    }

    /**
     * 得到总计
     * @return
     */
    public  Float  getTotal(){
        Float priceTotal =0.0f;
        for (Item item : items) {
            priceTotal = priceTotal + item.price();
        }
        return  priceTotal;
    }

    /**
     * 打印菜单
     */
    public void showItems(){
        for (Item item : items) {
            System.out.println(item.name());
            System.out.println(item.packing().pack());
            System.out.println(item.price());
        }
    }

}
