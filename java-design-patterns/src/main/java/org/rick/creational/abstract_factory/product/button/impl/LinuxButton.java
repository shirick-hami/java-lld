package org.rick.creational.abstract_factory.product.button.impl;

import org.rick.creational.abstract_factory.product.button.IButton;

public class LinuxButton implements IButton {
    @Override
    public void click() {
        System.out.println("Clicked Linux button...");
    }
}
