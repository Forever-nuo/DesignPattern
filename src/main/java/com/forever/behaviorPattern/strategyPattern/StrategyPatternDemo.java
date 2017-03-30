package com.forever.behaviorPattern.strategyPattern;

/**
 * Created by forever on 2017-3-29.
 */
public class StrategyPatternDemo  {
    public static void main(String[] args) {
        Context addContext = new Context(new OperationAdd());
        addContext.executeStrategy(2,3);
        Context substractContext = new Context(new OperationSubstract());
        substractContext.executeStrategy(2,3);
        Context multiplyContext = new Context(new OperationSubstract());
        multiplyContext.executeStrategy(2,3);

    }
}
