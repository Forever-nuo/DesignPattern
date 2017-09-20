package com.forever.behaviorPattern.templatePattern.demo1;

/**
 * 抽象类
 * Created by forever on 2017-3-29.
 */
public abstract class Game {
    abstract void initialize();

    abstract void startPlay();

    abstract void endPlay();

    /**
     * 最终的不可修改
     */
    public final void play() {
        initialize();
        startPlay();
        endPlay();
    }
}
