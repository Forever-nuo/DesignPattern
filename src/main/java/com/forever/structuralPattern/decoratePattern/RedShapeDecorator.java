package com.forever.structuralPattern.decoratePattern;

/**
 * Created by forever on 2017-3-23.
 */
public class RedShapeDecorator extends ShapeDecorate {

    public RedShapeDecorator(Shape shape) {
        super(shape);
    }

    /**
     * 画
     */
    @Override
    public void draw() {
        super.draw();
        setBorder();
    }

    private void setBorder() {
        System.out.println("红色边框");
    }
}
