package com.forever.behaviorPattern.IteratorPattern;

/**
 * Created by forever on 2017-3-28.
 */
public class IteratorPatternDemo {
    public static void main(String[] args) {
        NameRepository nameRepository = new NameRepository();
        Iterator iterator = nameRepository.getIterator();
        while(iterator.hasNext()) {
            String name = (String)iterator.next();
            System.out.println(name);
        }
    }
}
