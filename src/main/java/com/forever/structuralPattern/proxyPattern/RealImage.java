package com.forever.structuralPattern.proxyPattern;

/**
 * Created by forever on 2017-3-26.
 */
public class RealImage implements  Image {
    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFile(fileName);
    }

    public void display() {
        System.out.println("展示文件:"+fileName);
    }

    public void loadFile(String fileName){
        System.out.println("加载文件名:"+fileName);
    }
}
