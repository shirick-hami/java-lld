package org.rick.creational.factory;

import org.rick.creational.factory.creator.ALogistics;
import org.rick.creational.factory.creator.impl.RoadLogistics;
import org.rick.creational.factory.creator.impl.SeaLogistics;

public class Main {

    public static ALogistics logistics;

    public static void main(String[] args) {
        logistics = new RoadLogistics();
        logistics.startDelivering();

        logistics = new SeaLogistics();
        logistics.startDelivering();
    }
}
