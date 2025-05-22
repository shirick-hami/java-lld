package org.rick.creational.abstract_factory.client;

import org.rick.creational.abstract_factory.factory.OSAbstractFactory;
import org.rick.creational.abstract_factory.product.button.IButton;
import org.rick.creational.abstract_factory.product.checkbox.ICheckbox;

public class ApplicationClient {
    private IButton button;
    private ICheckbox checkbox;

    public ApplicationClient(OSAbstractFactory osAbstractFactory) {
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
