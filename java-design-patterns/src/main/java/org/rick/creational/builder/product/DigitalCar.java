package org.rick.creational.builder.product;

public class DigitalCar {
    private int seats;
    private int doors;
    private float horsePower;
    private float maxSpeed;

    public DigitalCar(int seats, int doors, float horsePower, float maxSpeed) {
        this.seats = seats;
        this.doors = doors;
        this.horsePower = horsePower;
        this.maxSpeed = maxSpeed;
    }

    public String printCarDescription() {
        String info = "";
        info += "Seats: " + seats + "\n";
        info += "Doors: " + doors + "\n";
        info += "Horsepower: " + horsePower + "\n";
        info += "Max Speed: " + maxSpeed + "\n";
        return info;
    }
}
