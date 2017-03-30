package com.forever.behaviorPattern.statePattern;

/**
 * Created by forever on 2017-3-29.
 */
public class Context {
    private State state;

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
