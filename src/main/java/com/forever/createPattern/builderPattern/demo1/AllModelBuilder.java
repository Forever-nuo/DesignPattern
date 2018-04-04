package com.forever.createPattern.builderPattern.demo1;

public class AllModelBuilder extends VideoBuilder {

    protected boolean isBuildMenu() {
        return true;
    }

    protected boolean isBuildPlayerList() {
        return true;
    }

    protected boolean isBuildMainWindow() {
        return true;
    }

    protected boolean isBuildControlStrip() {
        return true;
    }

    protected boolean isBuildFavorite() {
        return true;
    }
}
