package org.rick.creational.abstract_factory.product.button.impl;

import org.rick.creational.abstract_factory.product.button.IButton;

public class WindowsButton implements IButton {
    @Override
    public void click() {
        System.out.println("Clicked Windows Button...");
    }
}
