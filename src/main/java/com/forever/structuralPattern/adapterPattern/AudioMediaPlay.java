package com.forever.structuralPattern.adapterPattern;

/**
 * 接口的实现类
 * Created by forever on 2017-3-23.
 */
public class AudioMediaPlay implements MediaPlay {
    MediaAdapter mediaAdapter; //持有适配器类 聚合

    public void play(String audioType, String fileName) {
        if ("mp3".equalsIgnoreCase(audioType)) {
            System.out.println("播放 mp3 文件名:" + fileName);
        } else if ("mp4".equalsIgnoreCase(audioType) || "vl4".equalsIgnoreCase(audioType)) { //使用适配器间接调用另外一个接口的方法
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        } else {
            System.out.println("该 文件 类型 不支持播放!!");
        }
    }
}
