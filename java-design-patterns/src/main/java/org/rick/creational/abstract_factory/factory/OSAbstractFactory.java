package org.rick.creational.abstract_factory.factory;

import org.rick.creational.abstract_factory.product.button.IButton;
import org.rick.creational.abstract_factory.product.checkbox.ICheckbox;

public interface OSAbstractFactory {
    IButton createButton();
    ICheckbox createCheckbox();
}
