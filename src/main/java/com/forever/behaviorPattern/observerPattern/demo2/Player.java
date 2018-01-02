package com.forever.behaviorPattern.observerPattern.demo2;

import lombok.Data;

/**
 * Created by Forever丶诺 on 2018/1/2.
 */
@Data
public class Player implements  Observer{
    private String name ;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name =name;
    }

    public Player(String name) {
        this.name = name;
    }

    public void help() {
        System.out.println("坚持住,"+this.name+"来救你了!");
    }

    public void beAttacked(AllyControlCenter acc) {
        System.out.println(this.name + "被攻击！");
        acc.notifyObserver(name);
    }
}
