package org.rick.creational.abstract_factory.factory.impl;

import org.rick.creational.abstract_factory.factory.OSAbstractFactory;
import org.rick.creational.abstract_factory.product.button.IButton;
import org.rick.creational.abstract_factory.product.button.impl.LinuxButton;
import org.rick.creational.abstract_factory.product.checkbox.ICheckbox;
import org.rick.creational.abstract_factory.product.checkbox.impl.LinuxCheckbox;

public class LinuxFactory implements OSAbstractFactory {
    @Override
    public IButton createButton() {
        return new LinuxButton();
    }

    @Override
    public ICheckbox createCheckbox() {
        return new LinuxCheckbox();
    }
}
