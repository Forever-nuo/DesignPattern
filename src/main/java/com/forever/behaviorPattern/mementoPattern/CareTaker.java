package com.forever.behaviorPattern.mementoPattern;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * Created by Administrator on 2017/3/29.
 */
public class CareTaker {
    private List<Memento> mementoList = new ArrayList<Memento>();

    public void add(Memento state){
        mementoList.add(state);
    }

    public Memento get(int index){
        return mementoList.get(index);
    }
}
