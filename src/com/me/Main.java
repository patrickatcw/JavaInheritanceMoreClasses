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

    }

}
