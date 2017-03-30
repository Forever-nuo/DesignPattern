package com.forever.structuralPattern.proxyPattern;

/**
 * Created by forever on 2017-3-26.
 */
public class ProxyPatternDemo {

    public static void main(String[] args) {
        Image image = new ImageProxy("七龙珠.img");
        image.display();
        image.display();
    }


}
