package com.forever.structuralPattern.proxyPattern;

/**
 * 代理模式
 * 1.对对象进行控制
 * 2.聚合需要被代理的对象
 * 3.对被代理的对象进行控制
 * Created by forever on 2017-3-26.
 */
public class ImageProxy implements  Image{
    private RealImage realImage ;
    private String fileName;

    public ImageProxy(String fileName) {
        this.fileName = fileName;
    }

    public void display() {
        if(null==realImage){
            realImage=new RealImage(fileName);
        }
        realImage.display();
    }
}
