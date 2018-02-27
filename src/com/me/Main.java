package com.me;

public class Main {

    public static void main(String[] args) {

        Transportation transportation = new Transportation("car", 2);
        System.out.println("One type of transportation is a " + transportation.getType()
        + " with " + transportation.getWheels() + " wheels.");

        Car car = new Car("Chevy", 2, 2, 1);
        System.out.println("A type of car could be a " + car.getType() + " with " +
                car.getWheels() + " wheels, " + car.getDoors() + " doors, and " + car.getTrunk()
        + " trunk.");

        SemiTruck semiTruck = new SemiTruck("Big Rig",18, 3, 1);
        System.out.println("Another type of vehicle is a " + semiTruck.getType() +
        " which has " + semiTruck.getWheels() + " wheels. It has " + semiTruck.getSteps()
        + " steps to get into the driving cab and " + semiTruck.getSleeper() + " sleeper cab.");

        Bike bike = new Bike("Bike", 2, 1, 1);
        System.out.println("A " + bike.getType() + " is a " + bike.getWheels() + " wheel type of " +
                " transportation, with " + bike.getSeats() + " seat and " + bike.getHandbreaks()
        + " handbrake.");
    }

}
