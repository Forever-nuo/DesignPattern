package com.forever.structuralPattern.decoratePattern;

/**
 * Created by forever on 2017-3-23.
 */
public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Shape redShapeDecoratorCircle = new RedShapeDecorator(new Circle());
        redShapeDecoratorCircle.draw();
        Shape redShapeDecoratorRectangle = new RedShapeDecorator(new Rectangle());
        redShapeDecoratorRectangle.draw();
    }
}
