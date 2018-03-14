package com.forever.behaviorPattern.observerPattern.demo4;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public abstract class Observable {
    private Integer status=0; //绿灯行驶   红灯停止

    //有一个观察者对象的集合
    public List<Observer> observerList = new ArrayList<Observer>();

    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    public abstract void notifyAllObserver();

}
