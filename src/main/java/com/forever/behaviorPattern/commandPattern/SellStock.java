package com.forever.behaviorPattern.commandPattern;

/**
 * Created by forever on 2017-3-26.
 */
public class SellStock implements Order {
    private Stock stock;

    public SellStock(Stock stock) {
        this.stock = stock;
    }

    public void excute() {
        stock.sell();
    }
}
