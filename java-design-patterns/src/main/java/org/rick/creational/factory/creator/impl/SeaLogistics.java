package org.rick.creational.factory.creator.impl;

import org.rick.creational.factory.creator.ALogistics;
import org.rick.creational.factory.product.ITransport;
import org.rick.creational.factory.product.impl.SeaTransport;

public class SeaLogistics extends ALogistics {
    @Override
    protected ITransport createModeTransport() {
        return new SeaTransport();
    }
}
