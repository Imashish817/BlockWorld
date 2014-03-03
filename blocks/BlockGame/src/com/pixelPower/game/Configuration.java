package com.pixelPower.game;

import org.lwjgl.util.vector.Vector2f;

public class Configuration {
    public static boolean displayDebug = false;
    public static Vector2f viewingDistanceInChunks = new Vector2f(64.0f, 64.0f);


    public static Vector2f calcTextureMapCoords(int x, int y) {
        return new Vector2f(1.0f / (float) x, 1.0f / (float) y);
    }
}
