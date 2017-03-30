package com.forever.createPattern.factoryPattern;

/**
 * Created by Administrator on 2017/3/16.
 */
public class ShapeFactory {
    public static Shape getInstance(String shapeName) {
        if (null == shapeName) {
            return null;
        }
        if ("Circle".equals(shapeName)) {
            return new Circle();
        } else if ("Rectangle".equals(shapeName)) {
            return new Rectangle();
        } else if ("Square".equals(shapeName)) {
            return new Square();
        } else {
            return null;
        }
    }



}
