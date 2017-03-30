package com.forever.structuralPattern.flyWeight;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by forever on 2017-3-26.
 */
public class ShapeFactory {
    public static Map<String, Shape> shapeMap = new HashMap<String, Shape>();

    public static Shape getInstance(String color, String shape) {
        Shape shapeInstance = shapeMap.get(color + shape);
        if (null == shapeInstance) { //如果为空创建新的对象
            if ("circle".equalsIgnoreCase(shape)) {
                shapeInstance = new Circle(color);
            } else if ("Rectangle".equalsIgnoreCase(shape)) {
                shapeInstance = new Rectangle(color);
            } else {
                return null;
            }
            shapeMap.put(color + shape, shapeInstance);
            return shapeInstance;
        }
        return shapeInstance;
    }
}
