package org.rick.creational.builder.product;

public class PhysicalCar {
    private int seats;
    private int doors;
    private float horsePower;
    private float maxSpeed;
    private int fuel = 0;

    public PhysicalCar(int seats, int doors, float horsePower, float maxSpeed) {
        this.seats = seats;
        this.doors = doors;
        this.horsePower = horsePower;
        this.maxSpeed = maxSpeed;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public float getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(float horsePower) {
        this.horsePower = horsePower;
    }

    public float getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(float maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }
}
