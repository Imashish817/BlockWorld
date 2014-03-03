package com.pixelPower.game;

import org.lwjgl.Sys;
import org.lwjgl.opengl.Display;

public class FramePerSecond {
    float timeLastUpdate;
    int fpsCounter;
    float fps;

    void updateFPSDisplay() {
        Display.setTitle("Blockmania (FPS: " + fps);
    }

    public void frameRendered() {
        fps++;

        if (timeLastUpdate - getTime() > 1000) {
            calculateFPS();
            updateFPSDisplay();
        }
    }

    float getTime() {
        return (Sys.getTime() * 1000) / Sys.getTimerResolution();
    }

    void calculateFPS() {
        fps = fpsCounter / (getTime() - timeLastUpdate);
    }
}
