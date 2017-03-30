package com.forever.behaviorPattern.observerPattern;

/**
 * Created by forever on 2017-3-29.
 */
public class HexaObserver extends Observer {
    public HexaObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Binary String: " + Integer.toHexString(subject.getState()).toUpperCase());
    }
}
