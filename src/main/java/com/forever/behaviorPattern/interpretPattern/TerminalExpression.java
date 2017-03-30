package com.forever.behaviorPattern.interpretPattern;

/**
 * Created by forever on 2017-3-27.
 */
public class TerminalExpression implements Expression {
    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(String content) {
        return content.contains(data) ? true : false;
    }
}
