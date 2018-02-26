package com.me;

public class Transportation {                   //super class

    private String type;
    private int wheels;

    public Transportation(String type, int wheels) {
        this.type = type;
        this.wheels = wheels;
    }

    public String getType() {
        return type;
    }

    public int getWheels() {
        return wheels;
    }
}
