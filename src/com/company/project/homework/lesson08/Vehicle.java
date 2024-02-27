package com.company.project.homework.lesson08;

public class Vehicle {
    private int number;
    private int wearLevel;
    private int maxSpeed = 120;

    public Vehicle(int number, int wearLevel){
        if (number < 0) throw new IllegalArgumentException("Номер должен быть больше 0");
        if (wearLevel < 0) throw new IllegalArgumentException("Износ должжен быть больше 0");
        this.number = number;
        this.wearLevel = wearLevel;
    }

    public int getWearLevel() {
        return wearLevel;
    }

    public void setWearLevel(int wearLevel) {
        this.wearLevel = wearLevel;
    }

    public void repair(){
        if (wearLevel > 0)
            wearLevel--;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "number=" + number +
                ", wearLevel=" + wearLevel +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
