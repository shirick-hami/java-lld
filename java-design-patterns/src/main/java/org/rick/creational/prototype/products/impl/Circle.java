package org.rick.creational.prototype.products.impl;

import org.rick.creational.prototype.products.IShape;

public class Circle implements IShape {

    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    private Circle(Circle target) {
        if (target != null) {
            this.radius = target.radius;
        }
    }

    @Override
    public IShape clone() {
        return new Circle(this);
    }

    public int getRadius() {
        return radius;
    }
}
