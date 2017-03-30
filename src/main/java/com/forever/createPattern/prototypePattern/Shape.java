package com.forever.createPattern.prototypePattern;

import lombok.Data;

/**
 * Created by Administrator on 2017/3/16.
 */
@Data
public abstract class Shape implements Cloneable {
    private String id;
    protected String type;

    abstract void draw();


    protected Object clone() throws CloneNotSupportedException {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }

}
