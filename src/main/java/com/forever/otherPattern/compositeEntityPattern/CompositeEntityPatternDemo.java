package com.forever.otherPattern.compositeEntityPattern;

/**
 * Created by forever on 2017-3-30.
 */
public class CompositeEntityPatternDemo {
    public static void main(String[] args) {
        Client client = new Client();
        client.setData("Test", "Data");
        client.printData();
        client.setData("Second Test", "Data1");
        client.printData();
    }
}
