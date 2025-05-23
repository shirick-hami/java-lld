package org.rick.structural.adapter.holes;

import org.rick.structural.adapter.peg.RectanglePeg;

public class RectangleHole {
    private int length;
    private int width;

    private RectangleHole() {}

    public RectangleHole(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public boolean fits(RectanglePeg peg) {
        return (peg.getLength() <= this.length && peg.getWidth() <= this.width) || (peg.getWidth() <= this.length && peg.getLength() <= this.width);
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }
}
