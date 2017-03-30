package com.forever.structuralPattern.bridgePattern;

/**
 * Created by forever on 2017-3-23.
 */
public abstract class Shape  {
    protected DrawAPI drawAPI; //抽象类 聚合 接口

    protected Shape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }

   public abstract void draw();
}
