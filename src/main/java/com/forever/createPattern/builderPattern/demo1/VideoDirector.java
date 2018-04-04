package com.forever.createPattern.builderPattern.demo1;

import lombok.Data;

@Data
public class VideoDirector {
    private VideoBuilder videoBuilder;

    public VideoDirector(VideoBuilder videoBuilder) {
        this.videoBuilder = videoBuilder;
    }



    public VideoPlayer constructed() {
        return videoBuilder.buildVideoPlayer();
    }

}
