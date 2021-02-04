package com.company;

public class Car extends Vehicle implements Costable {

    private int doorsCount;

    public Car(int wheelCount, int doorsCount) {
        super(wheelCount);
        this.doorsCount = doorsCount;
    }

    @Override
    public void printInfo() {
        System.out.println("Транспорнтное средство: Машина - Количество дверей: " +
                doorsCount + " - Количество колёс: " + wheelCount + " - Стоимость: " + getCost() + "$");
    }

    @Override
    public int getCost() {
        return wheelCount * doorsCount * 100000;
    }
}
