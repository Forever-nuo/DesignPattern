package com.forever.structuralPattern.facadePattern;

/**
 * 形状制造者   外观类 一个单一的类
 * Created by forever on 2017-3-26.
 */
public class ShapeMaker {
    /***
     * 组合 接口的实现类
     */
    private Shape rectangle;
    private Shape circle;
    private Shape square;

    /***
     * 组合 依赖  构造函数 初始化
     */
    public ShapeMaker() {
        this.rectangle = new Rectangle();
        this.circle = new Circle();
        this.square = new Square();
    }

    /***
     * 方法 封装了 组合对象的方法
     */

    public void drawCircle() {
        circle.draw();
    }

    public void drawRectangle() {
        rectangle.draw();
    }

    public void drawSquare() {
        square.draw();
    }

}
