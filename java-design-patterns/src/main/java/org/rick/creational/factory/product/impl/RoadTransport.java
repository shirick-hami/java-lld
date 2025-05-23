package org.rick.creational.factory.product.impl;

import org.rick.creational.factory.product.ITransport;

public class RoadTransport implements ITransport {
    @Override
    public void deliver() {
        System.out.println("Delivered via Road...\n");
    }
}
