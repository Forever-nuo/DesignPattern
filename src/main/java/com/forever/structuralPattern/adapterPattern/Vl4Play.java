package com.forever.structuralPattern.adapterPattern;

/**
 * 高级播放器的实现类
 * Created by forever on 2017-3-23.
 */
public class Vl4Play implements AdvancedMediaPlay{

    /***
     * 实现方法
     * @param fileName
     */
    public void playVlc(String fileName) {
        System.out.println("播放 vl4 文件的名字:"+fileName);
    }

    /**
     * 不实现
     * @param fileName
     */
    public void playMp4(String fileName) {
    }
}
