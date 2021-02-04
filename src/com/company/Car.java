package com.company;

public class Car extends Vehicle implements Costable {

    private int doorsCount;
    private int cost;

    public Car(int wheelCount, int doorsCount, int cost) {
        super(wheelCount);
        this.doorsCount = doorsCount;
        this.cost = cost;
    }

    @Override
    public void printInfo() {
        System.out.println("Транспорнтное средство: Машина - Количество дверей: " +
                doorsCount + " - Количество колёс: " + wheelCount + " - Стоимость: " + getCost() + "$");
    }

    @Override
    public int getCost() {
        return cost;
    }
}
