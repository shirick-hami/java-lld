package org.rick.creational.prototype;

import org.rick.creational.prototype.products.impl.Circle;
import org.rick.creational.prototype.products.impl.Rectangle;

public class Main {
    public static void main(String[] args) {
        Circle circleOriginal = new Circle(20);
        Circle circleClone = (Circle) circleOriginal.clone();
        if (circleOriginal.getRadius() == circleClone.getRadius()) {
            System.out.println("Original Circle has been cloned successfully...");
        }

        Rectangle rectangleOriginal = new Rectangle(20, 40);
        Rectangle rectangleClone = (Rectangle) rectangleOriginal.clone();
        if (rectangleOriginal.getLength() == rectangleClone.getLength() && rectangleOriginal.getWidth() == rectangleClone.getWidth()) {
            System.out.println("Original Rectangle has been cloned successfully...");
        }
    }
}
