package org.rick.creational.abstract_factory.product.checkbox.impl;

import org.rick.creational.abstract_factory.product.checkbox.ICheckbox;

public class WindowsCheckbox implements ICheckbox {
    @Override
    public void check() {
        System.out.println("Windows Checkbox Clicked...");
    }
}
