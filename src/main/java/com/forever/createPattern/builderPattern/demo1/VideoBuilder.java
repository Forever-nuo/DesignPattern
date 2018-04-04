package com.forever.createPattern.builderPattern.demo1;

public abstract class VideoBuilder {

    protected VideoPlayer videoPlayer = new VideoPlayer();

    private void buildMenu() {
        videoPlayer.setMenu("菜单");
    }

    private void buildPlayerList() {
        videoPlayer.setPlayerList("播放列表");
    }

    private void buildMainWindow() {
        videoPlayer.setMainWindow("主窗口");
    }

    private void buildControlStrip() {
        videoPlayer.setControlStrip("控制条");
    }

    private void buildFavorite() {
        videoPlayer.setFavorite("收藏夹");
    }

    protected abstract boolean isBuildMenu();

    protected abstract boolean isBuildPlayerList();

    protected abstract boolean isBuildMainWindow();

    protected abstract boolean isBuildControlStrip();

    protected abstract boolean isBuildFavorite();



    public VideoPlayer buildVideoPlayer() {
        if (isBuildMenu()) {
            buildMenu();
        }

        if (isBuildPlayerList()) {
            buildPlayerList();
        }

        if (isBuildControlStrip()) {
            buildControlStrip();
        }
        if (isBuildMainWindow()) {
            buildMainWindow();
        }
        if (isBuildFavorite()) {
            buildFavorite();
        }
        return videoPlayer;
    }

}
