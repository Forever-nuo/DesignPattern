package com.forever.createPattern.prototypePattern;

/**
 * Created by Administrator on 2017/3/17.
 */
public class Square extends Shape {
    public Square() {
        type = "Square";
    }

    @Override
    void draw() {
        System.out.println("画正方形......");
    }
}
