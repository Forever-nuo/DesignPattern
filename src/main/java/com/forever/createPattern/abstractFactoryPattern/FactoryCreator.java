package com.forever.createPattern.abstractFactoryPattern;

/**
 * Created by Administrator on 2017/3/16.
 */
public class FactoryCreator {
    public static AbstractFactory getFactory(String factoryName) {
        if (null == factoryName) {
            return null;
        }
        if ("ShapeFactory".equals(factoryName)) {
            return new ShapeFactory();
        } else if ("ColorFactory".equals(factoryName)) {
            return new ColorFactory();
        }
        return null;
    }
}
