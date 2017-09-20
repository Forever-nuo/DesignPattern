package com.forever.behaviorPattern.templatePattern.demo2;

/**
 * Created by forever on 2017-4-22.
 */
public abstract class RunTime {

    /**
     * final 关键 防止恶意修改
     * @return
     */
    public final long getCodeRunTime() {
        long startTime = System.currentTimeMillis();
        runCode();
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    /**
     * 抽取出变化的部分 抽象 到子类中实现
     */
    public abstract void runCode();
}
