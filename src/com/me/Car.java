package com.me;

public class Car extends Transportation{

    private int doors;
    private int trunk;


    public Car(String type, int wheels) {
        super(type, wheels);
    }

    public Car(String type, int wheels, int doors, int trunk) {
        super(type, wheels);
        this.doors = doors;
        this.trunk = trunk;
    }

    public int getDoors() {
        return doors;
    }

    public int getTrunk() {
        return trunk;
    }
}
