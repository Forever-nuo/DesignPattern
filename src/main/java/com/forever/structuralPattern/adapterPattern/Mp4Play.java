package com.forever.structuralPattern.adapterPattern;

/**
 * 高级播放器的实现类
 * 实现该实现的方法
 * Created by forever on 2017-3-23.
 */
public class Mp4Play implements  AdvancedMediaPlay {
    public void playVlc(String fileName) {

    }

    public void playMp4(String fileName) {
        System.out.println("播放 MP4 文件名:"+fileName);
    }
}
