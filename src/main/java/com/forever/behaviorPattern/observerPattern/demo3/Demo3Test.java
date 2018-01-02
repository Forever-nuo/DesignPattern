package com.forever.behaviorPattern.observerPattern.demo3;

/**
 * Created by Forever丶诺 on 2018/1/2.
 */
public class Demo3Test {

    public static void main(String[] args) {
        //创建一个红绿灯
        Observable trafficLight = new TrafficLight();

        //注册观察者
        Observer carA = new CarObserver("汽车A");
        trafficLight.addObserver(carA);
        Observer carB = new CarObserver("汽车B");
        trafficLight.addObserver(carB);
        Observer carC = new CarObserver("汽车C");
        trafficLight.addObserver(carC);

        trafficLight.setStatus(0);
        trafficLight.notifyObservers();
        trafficLight.setStatus(1);
        trafficLight.notifyObservers();

    }
}
