package com.me;

public class SemiTruck extends Transportation {

    private int steps;
    private int sleeper;

    public SemiTruck(String type, int wheels) {
        super(type, wheels);
    }

    public SemiTruck(String type, int wheels, int steps, int sleeper) {
        super(type, wheels);
        this.steps = steps;
        this.sleeper = sleeper;
    }

    public int getSteps() {
        return steps;
    }

    public int getSleeper() {
        return sleeper;
    }
}
