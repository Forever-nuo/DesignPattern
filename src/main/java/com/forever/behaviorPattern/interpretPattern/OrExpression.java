package com.forever.behaviorPattern.interpretPattern;

/**
 * Created by forever on 2017-3-27.
 */
public class OrExpression implements Expression {
    private Expression expression1 = null;
    private Expression expression2 = null;

    public OrExpression(Expression expression1, Expression expression2) {
        this.expression1 = expression1;
        this.expression2 = expression2;
    }

    @Override
    public boolean interpret(String content) {
       return expression1.interpret(content) || expression2.interpret(content);
    }
}
