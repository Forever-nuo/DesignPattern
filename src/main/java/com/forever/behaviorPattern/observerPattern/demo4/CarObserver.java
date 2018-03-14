package com.forever.behaviorPattern.observerPattern.demo4;

public class CarObserver implements Observer {

    public void updateStatus(Observable observable) {
        if (observable.getStatus().equals(0)) {
            drive();
        } else if (observable.getStatus().equals(1)) {
            stop();
        }
    }

    private void drive() {
        System.out.println("骑车行驶...");
    }

    private void stop() {
        System.out.println("骑车停止");
    }

}
