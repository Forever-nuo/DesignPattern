package com.forever.behaviorPattern.mediatorPattern;

import java.util.Date;

/**
 * 聊天室
 * Created by forever on 2017-3-28.
 */
public class ChatRoom {
    public static void showMessage(User user, String message){ //中间者的静态方法 参数对象
        System.out.println(new Date().toString()
                + " [" + user.getName() +"] : " + message);
    }
}
