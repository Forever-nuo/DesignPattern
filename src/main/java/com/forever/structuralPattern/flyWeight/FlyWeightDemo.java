package com.forever.structuralPattern.flyWeight;

/**
 * 创建20个圆或者矩形 不同的颜色  不同的大小 坐标
 * Created by forever on 2017-3-26.
 */
public class FlyWeightDemo {
    public static void main(String[] args) {

        for (int i = 0; i < 20; i++) {
            Shape instance = ShapeFactory.getInstance(radomColor(), radomShape());
            Class<? extends Shape> aClass = instance.getClass();
            if ("Circle".equals(aClass.getSimpleName())) {
                Circle circle = (Circle) instance;
                circle.setRadius((int)(Math.random()*100));
                circle.setX((int)( Math.random() * 100));
                circle.setY((int) (Math.random() * 100));
            } else if ("Rectangle".equals(aClass.getSimpleName())){
                Rectangle rectangle = (Rectangle) instance;
                rectangle.setX((int)(Math.random()*100));
                rectangle.setY((int)(Math.random()*100));
            }
                instance.draw();
        }
    }

    public static String radomColor() {
        String[] color = new String[]{"red", "yellow", "green", "blue", "black"};
        return color[(int) (Math.random() * 5)];
    }

    public static String radomShape() {
        String[] shape = new String[]{"rectangle", "circle"};
        return shape[(int)( Math.random() * 2)];
    }
}
