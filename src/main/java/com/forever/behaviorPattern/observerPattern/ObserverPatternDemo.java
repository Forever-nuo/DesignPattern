package com.forever.behaviorPattern.observerPattern;

/**
 * Created by forever on 2017-3-29.
 */
public class ObserverPatternDemo {
    public static void main(String[] args) {

        Subject subject = new Subject();
        new BinaryObserver(subject);
        new OctalObserver(subject);
        new HexaObserver(subject);

        System.out.println("第一个状态是10");
        subject.setState(10);
        System.out.println("第二个状态是15");
        subject.setState(15);

    }
}
