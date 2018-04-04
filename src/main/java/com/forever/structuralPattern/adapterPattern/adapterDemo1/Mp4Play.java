package com.forever.structuralPattern.adapterPattern.adapterDemo1;

/**
 * 高级播放器的实现类
 * 实现该实现的方法
 *
 * @author Forever.诺
 * @date 2017-3-23
 */
public class Mp4Play implements AdvancedMediaPlay {

    @Override
    public void playVlc(String fileName) {

    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("播放 MP4 文件名:" + fileName);
    }
}
