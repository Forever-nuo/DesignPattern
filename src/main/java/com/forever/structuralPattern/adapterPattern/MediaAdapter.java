package com.forever.structuralPattern.adapterPattern;

/**
 * 适配器类
 * 1.实现接口1
 * 2.聚合,依赖 另外一个接口
 * Created by forever on 2017-3-23.
 */
public class MediaAdapter implements MediaPlay { // 实现接口1
    AdvancedMediaPlay advancedMediaPlay; //依赖,聚合另外一个接口

    public MediaAdapter(String audioType) {    //根据参数 初始化 不同的聚合引用
        if("vl4".equalsIgnoreCase(audioType)){
            advancedMediaPlay= new Vl4Play();
        }else if("mp4".equalsIgnoreCase(audioType)){
            advancedMediaPlay= new Mp4Play();
        }
    }

    public void play(String audioType, String fileName) { //根据不同的参数 调用不同的接口方法
        if("vl4".equalsIgnoreCase(audioType)){
            advancedMediaPlay.playVlc(fileName);
        }else if("mp4".equalsIgnoreCase(audioType)){
            advancedMediaPlay.playMp4(fileName);
        }
    }
}
