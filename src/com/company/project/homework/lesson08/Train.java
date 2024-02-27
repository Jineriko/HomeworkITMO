package com.company.project.homework.lesson08;

public class Train extends Vehicle {
    private int numberOfWagons;
    private boolean climateControl;

    public Train(int number, int wearLevel, int numberOfWagons, boolean climateControl){
        super(number, wearLevel);
        if (numberOfWagons < 0) throw new IllegalArgumentException("Число вагонов должно быть больше 0");
        this.climateControl = climateControl;
    }
    @Override
    public void repair(){
        if (getWearLevel() > 0){
            if (numberOfWagons > 7)
                setWearLevel(getWearLevel() - 1);
            else
                setWearLevel(getWearLevel() - 2);
        }
    }


}