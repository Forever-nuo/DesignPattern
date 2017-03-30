package com.forever.behaviorPattern.observerPattern;

/**
 * 观察者抽象对象
 * Created by forever on 2017-3-29.
 */
public abstract class Observer {
    protected Subject subject;

    public abstract void update();
}
