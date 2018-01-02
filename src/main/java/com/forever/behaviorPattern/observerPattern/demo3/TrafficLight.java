package com.forever.behaviorPattern.observerPattern.demo3;

/**
 * Created by Forever丶诺 on 2018/1/2.
 */
public class TrafficLight extends Observable {
    public void notifyObservers() {
        for (Observer car : cars) {
            car.update(this);
        }
    }
}
