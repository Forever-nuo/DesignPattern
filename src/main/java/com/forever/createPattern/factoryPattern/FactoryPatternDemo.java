package com.forever.createPattern.factoryPattern;

/**
 * Created by Administrator on 2017/3/16.
 */
public class FactoryPatternDemo {
    public static void main(String[] args) {
        Shape circle = ShapeFactory.getInstance("Circle");//通过工厂类创建 圆对象
        Shape rectangle = ShapeFactory.getInstance("Rectangle");
        Shape square = ShapeFactory.getInstance("Square");
        circle.draw();
        rectangle.draw();
        square.draw();
    }
}
