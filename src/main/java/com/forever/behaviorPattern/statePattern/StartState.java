package com.forever.behaviorPattern.statePattern;

/**
 * Created by forever on 2017-3-29.
 */
public class StartState implements  State {
    @Override
    public void doAction(Context context) {
        System.out.println("Player is in start state");
        context.setState(this);
    }

    public String toString(){
        return "Start State";
    }
}
