package com.forever.structuralPattern.bridgePattern;

/**
 * 桥接模式
 * 1.抽象类中聚合 接口
 * 2.抽象类的继承类 调用接口方法
 * Created by forever on 2017-3-23.
 */
public class BridgePatternDemo {
    public static void main(String[] args) {
        Shape redCircle = new Circle(new RedCircle(), 3, 0, 0);
        Shape greenCircle = new Circle(new GreenCircle(),5,2,2);
        redCircle.draw();
        greenCircle.draw();
    }
}
