package com.company.project.homework.lesson08;

public class Scooter extends Bicycle {
    private boolean isElectrical;

    public Scooter (int number, int wearLevel, boolean isElectrical){
        super(number, wearLevel);
        this.isElectrical = isElectrical;
    }

    @Override
    public void repair() {
        if (getWearLevel() > 0) {
            if (isElectrical)
                setWearLevel(getWearLevel() - 2);
            else
                setWearLevel(getWearLevel() - 3);
        }
    }


}