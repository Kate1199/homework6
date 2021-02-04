package com.company;

public class Main {

    public static void main(String[] args) {

        Motorcycle m1 = new Motorcycle(2, 300);
        Motorcycle m2 = new Motorcycle(2, 80);

        Car c1 = new Car(4, 4, 100000000);
        Car c2 = new Car(4, 2, 1000);

        m1.printInfo();
        m2.printInfo();

        System.out.println();

        c1.printInfo();
        c2.printInfo();
    }
}
