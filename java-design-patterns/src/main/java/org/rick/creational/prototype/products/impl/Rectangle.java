package org.rick.creational.prototype.products.impl;

import org.rick.creational.prototype.products.IShape;


public class Rectangle implements IShape {

    private int length;
    private int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    private Rectangle(Rectangle rectangle) {
        if (rectangle != null) {
            this.length = rectangle.length;
            this.width = rectangle.width;
        }
    }

    @Override
    public IShape clone() {
        return new Rectangle(this);
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
