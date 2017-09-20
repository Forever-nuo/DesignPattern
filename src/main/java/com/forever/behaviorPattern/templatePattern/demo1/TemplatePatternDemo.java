package com.forever.behaviorPattern.templatePattern.demo1;

/**
 * Created by forever on 2017-3-29.
 */
public class TemplatePatternDemo {
    public static void main(String[] args) {
        Game cricketGame = new Cricket();
        Game footBallGame = new Football();
        cricketGame.play();
        footBallGame.play();
    }
}
