package com.forever.structuralPattern.facadePattern;

/**
 * Created by forever on 2017-3-26.
 */
public class facadePatternDemo {

    public static void main(String[] args) {
        //创建外观类
        ShapeMaker shapeMaker = new ShapeMaker();

        //画不同的形状
        shapeMaker.drawCircle(); //画圆
        shapeMaker.drawRectangle(); //画矩形
        shapeMaker.drawSquare(); //画正方形
    }

}
