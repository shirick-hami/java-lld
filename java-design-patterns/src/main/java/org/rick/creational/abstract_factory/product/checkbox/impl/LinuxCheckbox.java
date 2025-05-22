package org.rick.creational.abstract_factory.product.checkbox.impl;

import org.rick.creational.abstract_factory.product.checkbox.ICheckbox;

public class LinuxCheckbox implements ICheckbox {
    @Override
    public void check() {
        System.out.println("Linux Checkbox Clicked...");
    }
}
