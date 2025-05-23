package org.rick.structural.adapter.holes;

import org.rick.structural.adapter.peg.SquarePeg;

public class SquareHole {
    private int edge;

    private SquareHole() {}

    public SquareHole(int edge) {
        this.edge = edge;
    }

    public boolean fits(SquarePeg peg) {
        return peg.getEdge() <= this.edge;
    }

    public int getEdge() {
        return edge;
    }
}
