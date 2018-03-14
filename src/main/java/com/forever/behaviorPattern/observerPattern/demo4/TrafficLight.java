package com.forever.behaviorPattern.observerPattern.demo4;

import javafx.collections.ObservableList;

/**
 * 具体实现的被观察者
 */
public class TrafficLight extends Observable {
    public void notifyAllObserver() {
        for (Observer observer : observerList) {

        }
    }
}
