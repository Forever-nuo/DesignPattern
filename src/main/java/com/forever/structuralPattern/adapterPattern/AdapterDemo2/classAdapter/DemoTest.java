package com.forever.structuralPattern.adapterPattern.AdapterDemo2.classAdapter;

import org.junit.Test;

/**
 * 对象适配器
 * 主要点: 适配器和适配者的关系是组合关系
 *
 * @author: Forever丶诺
 * @date: 2018/4/4 10:00
 */
public class DemoTest {

    @Test
    public void test() {
        Target target = new Adapter();
        target.targetFun();
    }
}
