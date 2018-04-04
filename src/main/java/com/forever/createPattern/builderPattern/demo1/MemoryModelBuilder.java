package com.forever.createPattern.builderPattern.demo1;

public class MemoryModelBuilder extends VideoBuilder {
    protected boolean isBuildMenu() {
        return false;
    }

    protected boolean isBuildPlayerList() {
        return false;
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
