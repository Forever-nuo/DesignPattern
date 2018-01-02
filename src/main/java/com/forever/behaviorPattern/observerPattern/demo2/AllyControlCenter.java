package com.forever.behaviorPattern.observerPattern.demo2;

import lombok.Data;

import java.util.ArrayList;

/**
 * 战队控制中心类:目标类
 * Created by Forever丶诺 on 2018/1/2.
 */
@Data
public abstract class AllyControlCenter {
    protected String allyName; //战队名称

    protected ArrayList<Observer> players = new ArrayList<Observer>(); //定义一个集合存放战队成员

    //注册方法
    public void join(Observer obs) {
        System.out.println(obs.getName() + "加入" + this.allyName + "战队!");
        players.add(obs);
    }

    //声明抽象通知方法
    public abstract void notifyObserver(String name);
}
