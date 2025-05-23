package org.rick.creational.builder.car_builder.impl;

import org.rick.creational.builder.car_builder.ICarBuilder;
import org.rick.creational.builder.product.PhysicalCar;

public class PhysicalCarBuilder implements ICarBuilder {

    private int seats;
    private int doors;
    private float horsePower;
    private float maxSpeed;


    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setDoors(int doors) {
        this.doors = doors;
    }

    @Override
    public void setHorsePower(float horsepower) {
        this.horsePower = horsepower;
    }

    @Override
    public void setMaxSpeed(float maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public PhysicalCar getPhysicalCar() {
        return new PhysicalCar(seats, doors, horsePower, maxSpeed);
    }
}
