package com.forever.behaviorPattern.commandPattern;

/**
 * 物品
 * Created by forever on 2017-3-26.
 */
public class Stock {
    private  String name; //物品名称
    private  int quantity;  //物品数量

    public Stock(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public void buy(){
        System.out.println("物品 [ 名称: "+name+", 数量: " + quantity +" ] bought");
    }

    public void  sell(){
        System.out.println("物品 [ 名称: "+name+", 数量: " + quantity +" ] sold");
    }
}
