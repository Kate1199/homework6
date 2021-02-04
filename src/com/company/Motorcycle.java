package com.company;

public class Motorcycle extends Vehicle {

    private int maxSpeed;

    public Motorcycle(int wheelCount, int maxSpeed) {
        super(wheelCount);
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void printInfo() {
        System.out.println("Транспортное средство: Мотоцикл - Количество колёс: " +
                wheelCount + " - Максимальная скорость: " + maxSpeed + " км/ч");
    }
}
