package com.forever.behaviorPattern.observerPattern;

/**
 * 8进制观察者
 * Created by forever on 2017-3-29.
 */
public class OctalObserver extends Observer {

    public OctalObserver(Subject subject) {
        this.subject = subject;
        subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Octal String: " + Integer.toOctalString(subject.getState()));

    }
}
