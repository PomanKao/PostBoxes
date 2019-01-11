package com.pomankao;

public abstract class Box {
    protected float bLength;
    protected float bWidth;
    protected int bHeight;

    public Box(float bLength, float bWidth, int bHeight) {
        this.bLength = bLength;
        this.bWidth = bWidth;
        this.bHeight = bHeight;
    }

    protected abstract boolean validate(float length, float width, int height);


}
