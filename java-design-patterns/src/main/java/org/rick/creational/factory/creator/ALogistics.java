package org.rick.creational.factory.creator;

import org.rick.creational.factory.product.ITransport;

public abstract class ALogistics {

    public void startDelivering() {
        String logger = "";
        logger += "Basic Product packaging starting...\n";
        logger += "Basic Product packaging ended...";

        System.out.println(logger);

        ITransport transport = createModeTransport();
        transport.deliver();
    }

    protected abstract ITransport createModeTransport();
}
