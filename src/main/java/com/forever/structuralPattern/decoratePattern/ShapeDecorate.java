package com.forever.structuralPattern.decoratePattern;

/**
 * Created by forever on 2017-3-23.
 */
public class ShapeDecorate implements Shape {
    protected Shape shape;

    public ShapeDecorate(Shape shape) {
        this.shape = shape;
    }

    /**
     * 画
     */
    public void draw() {
        shape.draw();
    }
}
