package com.forever.behaviorPattern.templatePattern.demo1;

/**
 * Created by forever on 2017-3-29.
 */
public class Football extends  Game {
    @Override
    void initialize() {
        System.out.println("Football Game Initialized! Start playing.");
    }

    @Override
    void startPlay() {
        System.out.println("Football Game Started. Enjoy the game!");
    }

    @Override
    void endPlay() {
        System.out.println("Football Game Finished!");
    }
}
