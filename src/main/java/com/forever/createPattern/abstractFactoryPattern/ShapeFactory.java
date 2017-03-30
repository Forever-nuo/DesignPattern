package com.forever.createPattern.abstractFactoryPattern;


/**
 * Created by Administrator on 2017/3/16.
 */
public class ShapeFactory extends AbstractFactory {

    @Override
    Color getColor(String colorName) {
        return null;
    }

    @Override
    Shape getShape(String shapeName) {
        if (null==shapeName){
            return  null;
        }
        if ("Circle".equals(shapeName)) {
            return new Circle();
        } else if ("Rectangle".equals(shapeName)) {
            return new Rectangle();
        } else if ("Square".equals(shapeName)) {
            return new Square();
        }
        return null;
    }
}
