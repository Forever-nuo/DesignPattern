package com.forever.behaviorPattern.IteratorPattern;

/**
 * 创建一个迭代器接口
 * 该接口有方法
 * Created by forever on 2017-3-28.
 */
public interface Iterator {
    boolean hasNext(); //是否有下一个元素
    Object next(); //得到下一个元素

}
