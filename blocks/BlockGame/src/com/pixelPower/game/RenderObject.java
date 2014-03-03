package com.pixelPower.game;

import org.lwjgl.util.vector.Vector3f;

public abstract class RenderObject {
    protected Vector3f position = new Vector3f(0.0f, 0.0f, 0.0f);

    public void render() {
    }

    public final Vector3f getPosition() {
        return position;
    }

    public final void setPosition(Vector3f position) {
        this.position = position;
    }
}
