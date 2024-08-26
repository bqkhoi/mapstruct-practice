package group1.application.car.entity;

import group1.application.common.CarType;

public class Car {
    private String name;
    private CarType type;
    private int numberOfSeats;

    public String getName() {
        return name;
    }

    public CarType getType() {
        return type;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public Car(String name, CarType type, int numberOfSeats) {
        this.name = name;
        this.type = type;
        this.numberOfSeats = numberOfSeats;
    }
}
