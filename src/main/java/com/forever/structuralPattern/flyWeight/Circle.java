package com.forever.structuralPattern.flyWeight;

/**
 * Created by forever on 2017-3-26.
 */
public class Circle implements Shape {
    private int radius; //半径
    private int x; //x坐标
    private int y; //y坐标
    private String color;


    public Circle( String color) {

        this.color = color;
    }

    public void draw() {
        System.out.println("画圆[颜色:" + color + ",半径:" + radius + ",x坐标:" + x + ",y坐标:" + y + "]");
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void draw(int radius, int x, int y) {

    }
}
