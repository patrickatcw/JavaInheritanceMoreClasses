package com.me;

public class Bike extends Transportation {

    private int seats;
    private int handbreaks;

    public Bike(String type, int wheels) {
        super(type, wheels);
    }

    public Bike(String type, int wheels, int seats, int handbreaks) {
        super(type, wheels);
        this.seats = seats;
        this.handbreaks = handbreaks;
    }



}
