package com.forever.behaviorPattern.mementoPattern;

/**
 * 备忘类Memento 包含了要被恢复的对象的状态
 * Created by Administrator on 2017/3/29.
 */

public class Memento {
    private String state;

    public Memento(String state){
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
