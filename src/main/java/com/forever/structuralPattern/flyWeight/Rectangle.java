package com.forever.structuralPattern.flyWeight;

/**
 * Created by forever on 2017-3-26.
 */
class Rectangle implements Shape {
    private int x; //x坐标
    private int y; //y坐标
    private String color;

    public Rectangle(String color) {
        this.color = color;
    }


    public void draw() {
        System.out.println("画矩形[颜色:" + color + ",长:" + x + ",宽:" + y + "]");
    }



    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
}
