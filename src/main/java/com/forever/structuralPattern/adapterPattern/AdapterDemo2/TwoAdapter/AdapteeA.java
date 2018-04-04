package com.forever.structuralPattern.adapterPattern.AdapterDemo2.TwoAdapter;

/**
 * @author: Forever丶诺
 * @date: 2018/4/4 9:58
 */
public class AdapteeA implements Adaptee {
    @Override
    public void adapteeFun() {
        System.out.println("适配者A的方法");
    }
}
