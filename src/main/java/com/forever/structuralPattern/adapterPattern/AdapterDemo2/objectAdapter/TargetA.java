package com.forever.structuralPattern.adapterPattern.AdapterDemo2.objectAdapter;

/**
 * @author: Forever丶诺
 * @date: 2018/4/4 9:55
 */
public class TargetA implements Target {
    @Override
    public void targetFun() {
        System.out.println("目标类A执行方法");
    }
}
