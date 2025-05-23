package org.rick.creational.builder.car_builder;

public interface ICarBuilder {
    void setSeats(int seats);
    void setDoors(int doors);
    void setHorsePower(float horsepower);
    void setMaxSpeed(float maxSpeed);
}
