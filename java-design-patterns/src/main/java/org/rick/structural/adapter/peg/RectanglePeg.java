package org.rick.structural.adapter.peg;

public class RectanglePeg {
    private int length;
    private int width;

    private RectanglePeg() {}

    public RectanglePeg(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }
}
