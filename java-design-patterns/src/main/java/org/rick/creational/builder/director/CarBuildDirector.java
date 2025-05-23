package org.rick.creational.builder.director;

import org.rick.creational.builder.car_builder.ICarBuilder;

public class CarBuildDirector {

    public void buildSportsCar(ICarBuilder builder) {
        builder.setSeats(2);
        builder.setDoors(2);
        builder.setHorsePower(900.28f);
        builder.setMaxSpeed(380.7f);
    }

    public void buildFamilyCar(ICarBuilder builder) {
        builder.setSeats(7);
        builder.setDoors(5);
        builder.setHorsePower(300);
        builder.setMaxSpeed(150);
    }
}
