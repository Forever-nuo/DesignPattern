package com.forever.behaviorPattern.commandPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 调用者 调用命令
 * Created by forever on 2017-3-26.
 */
public class Broker {
    private List<Order> orders = new ArrayList<Order>(); //多个命令

    public void takeOrder(Order order) { //添加命令
        orders.add(order);
    }

    public void placeOrder() {      //调用命令
        for (Order order : orders) {
            order.excute();
        }
        orders.clear();
    }

}
