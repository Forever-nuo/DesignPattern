package com.forever.createPattern.abstractFactoryPattern;

/**
 * Created by Administrator on 2017/3/16.
 */
public class ColorFactory extends AbstractFactory {

    @Override
     Color getColor(String colorName) {
        if (null == colorName) {
            return null;
        }
        if ("Green".equals(colorName)) {
            return new Green();
        } else if ("Blue".equals(colorName)) {
            return new Blue();
        } else if ("Red".equals(colorName)) {
            return new Red();
        }
        return null;
    }

    @Override
    Shape getShape(String shapeName) {
        return null;
    }
}
