package com.forever.behaviorPattern.mediatorPattern;

import lombok.Data;

/**
 * Created by forever on 2017-3-28.
 */
@Data
public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public void sendMessage(String message) { //对象的方法中封装了中介者
        ChatRoom.showMessage(this, message);
    }
}
