package com.forever.structuralPattern.bridgePattern;

/**
 * Created by forever on 2017-3-23.
 */
public class GreenCircle implements  DrawAPI {
    public void drawCircle(int radius, int x, int y) {
        System.out.println("画圆[颜色:绿色,半径:"+radius+",x坐标:"+x+",y坐标:"+y+"]");
    }
}
