package com.forever.behaviorPattern.observerPattern;

/**
 * Created by forever on 2017-3-29.
 */
public class BinaryObserver extends Observer {

    /**
     * 初始化观察者
     *
     * @param subject
     */
    public BinaryObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Binary String: " + Integer.toBinaryString(subject.getState()));
    }
}
