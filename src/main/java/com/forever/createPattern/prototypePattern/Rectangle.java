package com.forever.createPattern.prototypePattern;

/**
 * Created by Administrator on 2017/3/17.
 */
public class Rectangle extends  Shape {
    public Rectangle() {
        type = "Rectangle";
    }

    @Override
    void draw() {
        System.out.println("画矩形......");
    }
}
