package org.rick.structural.adapter.peg.adapter;

import org.rick.structural.adapter.peg.RectanglePeg;
import org.rick.structural.adapter.peg.SquarePeg;

public class RectanglePegToSquareHoleAdapter extends SquarePeg {
    private RectanglePeg rectanglePeg;

    public RectanglePegToSquareHoleAdapter(RectanglePeg rectanglePeg) {
        this.rectanglePeg = rectanglePeg;
    }

    @Override
    public int getEdge() {
        if (rectanglePeg.getLength() >= rectanglePeg.getWidth()) {
            return rectanglePeg.getLength();
        } else {
            return rectanglePeg.getWidth();
        }
    }
}
