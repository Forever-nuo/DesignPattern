package com.forever.structuralPattern.adapterPattern.AdapterDemo2.classAdapter;/**
 * @author: Forever丶诺
 * @date: 2018/4/4 9:56
 */

/**
 * @author: Forever丶诺
 * @date: 2018/4/4 9:56
 */
public class Adapter extends AdapteeA implements Target {

    @Override
    public void targetFun() {
        this.adapteeFun();
    }
}
