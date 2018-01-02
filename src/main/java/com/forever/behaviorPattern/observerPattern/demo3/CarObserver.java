package com.forever.behaviorPattern.observerPattern.demo3;

import lombok.Data;

/**
 * Created by Forever丶诺 on 2018/1/2.
 */
@Data
public class CarObserver implements Observer {
    private String name;

    public CarObserver(String name) {
        this.name = name;
    }

    public void update(Observable observable) {
        if (observable.getStatus().equals(1)){
            drive();
        }else{
            stop();
        }
    }

    public  void  drive(){
        System.out.println(this.name+"汽车行驶");
    }

    public  void stop(){
        System.out.println(this.name+"汽车停止");
    }

}
