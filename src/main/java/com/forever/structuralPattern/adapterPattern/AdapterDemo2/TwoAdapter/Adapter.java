package com.forever.structuralPattern.adapterPattern.AdapterDemo2.TwoAdapter;/**
 * @author: Forever丶诺
 * @date: 2018/4/4 9:56
 */

/**
 * @author: Forever丶诺
 * @date: 2018/4/4 9:56
 */
public class Adapter implements Target, Adaptee {

    private Target target;

    private Adaptee adaptee;

    public Adapter(Target target) {
        this.target = target;
    }

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void targetFun() {
        adaptee.adapteeFun();
    }

    @Override
    public void adapteeFun() {
        target.targetFun();
    }
}
