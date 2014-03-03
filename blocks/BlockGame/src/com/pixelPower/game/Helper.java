package com.pixelPower.game;

import org.lwjgl.Sys;

public class Helper {

    long timeLastFrame;
    long timeLastUpdate;
    int frameCounter;
    float fps;

    public Helper() {
        updateFPSDisplay();
    }

    final void updateFPSDisplay() {
//        Display.setTitle("Blockmania (FPS: " + fps + ", Quads: "+Chunk.quadCounter+")");

        timeLastUpdate = getTime();
        frameCounter = 0;
    }

    public void frameRendered() {
        frameCounter++;
        timeLastFrame = getTime();

        if (getTime() - timeLastUpdate > 1000) {
            calculateFPS();
            updateFPSDisplay();
        }
    }

    public double timeSinceLastFrame() {
        return getTime()-timeLastFrame;
    }

    long getTime() {
        return (Sys.getTime() * 1000) / Sys.getTimerResolution();
    }

    void calculateFPS() {
        fps = frameCounter / ((getTime() - timeLastUpdate) / 1000);
    }
}
