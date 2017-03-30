package com.forever.behaviorPattern.commandPattern;

import javax.swing.*;

/**
 * Created by forever on 2017-3-26.
 */
public class CommandPattern {
    public static void main(String[] args) {
        //创建一个请求
        Stock stock = new Stock("梨子",10);
        //创建命令
        Order buyStock = new BuyStock(stock);
        Order sellStock = new SellStock(stock);
        //调用命令者
        Broker broker = new Broker();
        broker.takeOrder(buyStock);
        broker.takeOrder(sellStock);

        broker.placeOrder();

    }
}
