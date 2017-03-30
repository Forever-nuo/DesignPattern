package com.forever.createPattern.abstractFactoryPattern;

/**
 * Created by Administrator on 2017/3/16.
 */
public abstract class AbstractFactory {
     abstract  Color getColor(String colorName);
    abstract  Shape getShape(String shapeName);
}
