package com.forever.behaviorPattern.observerPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 目标对象
 * Created by forever on 2017-3-29.
 */
public class Subject {
    /**
     * observer 是依赖对象
     */
    private List<Observer> observers = new ArrayList<Observer>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    /**
     * 归属于
     *
     * @param observer
     */
    public void attach(Observer observer) {
        observers.add(observer);
    }

    /**
     * 通知所有的观察者
     */
    private void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
