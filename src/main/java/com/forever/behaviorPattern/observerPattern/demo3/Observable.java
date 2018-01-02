package com.forever.behaviorPattern.observerPattern.demo3;

import lombok.Data;

import java.util.ArrayList;

/**
 * Created by Forever丶诺 on 2018/1/2.
 */
@Data
public abstract class Observable {

    private Integer status =0; //1 红 0 绿

    //观察者对象
    protected ArrayList<Observer> cars = new ArrayList<Observer>();

    public void addObserver(Observer observer) {
        cars.add(observer);
    }

    public abstract void notifyObservers();


}
