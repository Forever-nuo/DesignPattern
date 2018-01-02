package com.forever.behaviorPattern.observerPattern.demo2;

import lombok.core.SpiLoadUtil;

/**
 * 具体战队控制中心类:具体工具类
 * Created by Forever丶诺 on 2018/1/2.
 */
public class ConcreteAllyControlCenter extends AllyControlCenter {

    public ConcreteAllyControlCenter(String allyName) {
        System.out.println(allyName + "战队组建成功!");
        System.out.println("------------------------------");
        this.allyName = allyName;
    }

    public void notifyObserver(String name) {
        System.out.println(this.allyName + "战队紧急通知,盟友" + name + "遭受敌人攻击!");
        for (Observer player : players) {
            if (!player.getName().equalsIgnoreCase(name))
                player.help();
        }
    }
}
