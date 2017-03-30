package com.forever.behaviorPattern.statePattern;

/**
 * Created by forever on 2017-3-29.
 */
public class StopState implements  State {
    @Override
    public void doAction(Context context) {
        System.out.println("Player is in stop state");
        context.setState(this);
    }

    public String toString(){
        return "Stop State";
    }
}
