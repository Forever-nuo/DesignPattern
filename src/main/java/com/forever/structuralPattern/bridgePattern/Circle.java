package com.forever.structuralPattern.bridgePattern;

/**
 * Created by forever on 2017-3-23.
 */
public class Circle extends  Shape { //继承抽象类
    private int radius;
    private int x;
    private int y;
    protected Circle(DrawAPI drawAPI,int radius,int x,int y) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius =radius;
    }

    @Override
    public void draw() { //实现抽象方法 调用另外一个接口的方法
        drawAPI.drawCircle(radius,x,y);
    }
}
