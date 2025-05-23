package org.rick.creational.builder;

import org.rick.creational.builder.car_builder.impl.DigitalCarBuilder;
import org.rick.creational.builder.car_builder.impl.PhysicalCarBuilder;
import org.rick.creational.builder.director.CarBuildDirector;
import org.rick.creational.builder.product.DigitalCar;
import org.rick.creational.builder.product.PhysicalCar;

public class Main {
    public static void main(String[] args) {
        CarBuildDirector director = new CarBuildDirector();

        PhysicalCarBuilder physicalCarBuilder = new PhysicalCarBuilder();
        director.buildSportsCar(physicalCarBuilder);
        PhysicalCar physicalCar = physicalCarBuilder.getPhysicalCar();
        System.out.println("Car 1 Built with Horsepower : " + physicalCar.getHorsePower());

        DigitalCarBuilder digitalCarBuilder = new DigitalCarBuilder();
        director.buildFamilyCar(digitalCarBuilder);
        DigitalCar digitalCar = digitalCarBuilder.getDigitalCar();
        System.out.println("You are looking at Car 2 with these specifications : \n" + digitalCar.printCarDescription());
    }
}
