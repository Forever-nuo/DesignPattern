package com.forever.behaviorPattern.commandPattern;

/**
 * 买物品 命令
 * Created by forever on 2017-3-26.
 */
public class BuyStock implements Order {
    private Stock stoke; //组合请求

    public BuyStock(Stock stoke) {
        this.stoke = stoke;
    }

    public void excute() {
        stoke.buy();
    }
}
