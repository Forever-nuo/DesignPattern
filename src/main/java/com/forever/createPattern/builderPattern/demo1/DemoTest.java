package com.forever.createPattern.builderPattern.demo1;

import org.junit.Test;

public class DemoTest {

    @Test
    public void testBuildPattern() {
        //创建指挥者

        //使用
        VideoDirector videoDirector = new VideoDirector(new AllModelBuilder());
        VideoPlayer videoPlayer = videoDirector.constructed();
        System.out.println(  videoPlayer.toString());


        //切换到简单模式

        videoDirector.setVideoBuilder(new SimpleModelBuilder());
        videoPlayer = videoDirector.constructed();
        System.out.println(  videoPlayer.toString());


        //切换到记忆模式
        videoDirector.setVideoBuilder(new MemoryModelBuilder());
        videoPlayer = videoDirector.constructed();
        System.out.println(  videoPlayer.toString());

    }
}
