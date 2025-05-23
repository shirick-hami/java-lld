package org.rick.structural.adapter;

import org.rick.structural.adapter.holes.SquareHole;
import org.rick.structural.adapter.peg.RectanglePeg;
import org.rick.structural.adapter.peg.SquarePeg;
import org.rick.structural.adapter.peg.adapter.RectanglePegToSquareHoleAdapter;

public class Main {
    public static void main(String[] args) {
        SquareHole squareHole = new SquareHole(20);

        // Case 1 Same Type
        SquarePeg squarePeg = new SquarePeg(20);
        if (squareHole.fits(squarePeg)) {
            System.out.println(String.format("Square Peg of size %s fits in Square Hole of size %s.", squarePeg.getEdge(), squareHole.getEdge()));
        } else {
            System.out.println(String.format("Square Peg of size %s does not fit in Square Hole of size %s.", squarePeg.getEdge(), squareHole.getEdge()));
        }


        // Case 2 Fitting Rectangle Pegs in Square Holes
        int[] lengths = new int[]{20,10,20,15,31,100};
        int[] widths = new int[]{20,20,10,15,1,100};

        for (int i = 0; i < lengths.length; i++) {
            RectanglePeg rectanglePeg = new RectanglePeg(lengths[i], widths[i]);
            RectanglePegToSquareHoleAdapter rectanglePegToSquareHoleAdapter = new RectanglePegToSquareHoleAdapter(rectanglePeg);
            if (squareHole.fits(rectanglePegToSquareHoleAdapter)) {
                System.out.println(String.format("Rectangle Peg of size %sx%s fits in Square Hole of size %s.", rectanglePeg.getLength(), rectanglePeg.getWidth(), squareHole.getEdge()));
            } else {
                System.out.println(String.format("Rectangle Peg of size %sx%s does not fit in Square Hole of size %s.", rectanglePeg.getLength(), rectanglePeg.getWidth(), squareHole.getEdge()));
            }
        }
    }
}
