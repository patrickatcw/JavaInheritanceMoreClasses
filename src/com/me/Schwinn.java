package com.me;

public class Schwinn extends Bike {

    private int reflectors;
    private int fenders;

    /*public Schwinn(String type, int wheels, int seats, int handbreaks) {
        super(type, wheels, seats, handbreaks);

    }*/

    public Schwinn(String type, int wheels, int seats, int handbreaks, int reflectors, int fenders) {
        super(type, wheels, seats, handbreaks);
        this.reflectors = reflectors;
        this.fenders = fenders;
    }

    public int getReflectors() {
        return reflectors;
    }

    public int getFenders() {
        return fenders;
    }
}
