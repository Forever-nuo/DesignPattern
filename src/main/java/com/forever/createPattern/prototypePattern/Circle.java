package com.forever.createPattern.prototypePattern;

/**
 * Created by Administrator on 2017/3/17.
 */
public class Circle extends Shape {

    public Circle() {
        type="Circle";
    }

    @Override
    void draw() {
        System.out.println("画圆.......");
    }
}
