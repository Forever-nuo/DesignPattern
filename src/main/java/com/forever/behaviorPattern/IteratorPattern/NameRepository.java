package com.forever.behaviorPattern.IteratorPattern;

/**
 * Created by forever on 2017-3-28.
 * 实现container 接口
 */

public class NameRepository implements Container {

    public String[] names = {"Robert", "John", "Julie", "Lora"};

    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    /**
     * 内部类 实现 iterator
     */
    private class NameIterator implements Iterator {
        int index;

        @Override
        public boolean hasNext() {
            if (index < names.length) {
                return true;
            }
            return false;
        }

        /**
         * 得到下一个元素
         *
         * @return
         */
        @Override
        public Object next() {
            if (hasNext()) {
                return names[index++];
            }
            return null;
        }
    }
}
