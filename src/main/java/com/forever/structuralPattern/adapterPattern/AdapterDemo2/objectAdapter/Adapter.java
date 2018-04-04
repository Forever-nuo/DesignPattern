package com.forever.structuralPattern.adapterPattern.AdapterDemo2.objectAdapter;/**
 * @author: Forever丶诺
 * @date: 2018/4/4 9:56
 */

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * @author: Forever丶诺
 * @date: 2018/4/4 9:56
 */
public class Adapter implements Target {

    private Adaptee adaptee = new AdapteeA();


    @Override
    public void targetFun() {
        adaptee.adapteeFun();
    }
}
