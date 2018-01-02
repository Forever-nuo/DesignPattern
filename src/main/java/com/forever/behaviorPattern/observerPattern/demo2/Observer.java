package com.forever.behaviorPattern.observerPattern.demo2;

/**
 * 观察者对象
 * Created by Forever丶诺 on 2018/1/2.
 */
interface Observer {

    String getName();

    void setName(String name);

    void help();//声明支援盟友的方法

    void beAttacked(AllyControlCenter acc);//声明遭受攻击方法

}
