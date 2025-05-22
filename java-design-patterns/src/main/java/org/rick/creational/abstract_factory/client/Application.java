package org.rick.creational.abstract_factory.client;

import org.rick.creational.abstract_factory.factory.OSAbstractFactory;
import org.rick.creational.abstract_factory.product.button.IButton;
import org.rick.creational.abstract_factory.product.checkbox.ICheckbox;

public class Application {
    private IButton button;
    private ICheckbox checkbox;

    public Application(OSAbstractFactory osAbstractFactory) {
        this.button = osAbstractFactory.createButton();
        this.checkbox = osAbstractFactory.createCheckbox();
    }

    public void clickButton() {
        button.click();
    }

    public void clickCheckbox() {
        checkbox.check();
    }
}
