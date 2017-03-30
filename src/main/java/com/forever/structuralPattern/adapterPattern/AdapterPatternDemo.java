package com.forever.structuralPattern.adapterPattern;

/**
 * Created by forever on 2017-3-23.
 */
public class AdapterPatternDemo {

    public static void main(String[] args) {
        AudioMediaPlay audioMediaPlay = new AudioMediaPlay();
        audioMediaPlay.play("vl4", "春天在哪里.vl4");
        audioMediaPlay.play("mp3", "死了都要爱.MP3");
        audioMediaPlay.play("mp4", "春泥.MP4");
        audioMediaPlay.play("mvc", "逆战.mvc");
    }
}
