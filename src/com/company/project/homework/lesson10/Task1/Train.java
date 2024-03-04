package com.company.project.homework.lesson10.Task1;

import java.util.Arrays;

public class Train {
    private String number;
    private Locomotive locomotive;
    private RailwayCarriage[] railwayCarriages;

    public Train(String number, Locomotive locomotive) {
        if (number == null) throw new IllegalArgumentException("Номер поезда не должен быть пустым");
        if (locomotive == null) throw new IllegalArgumentException("Поезд не может существовать без локомотива");
        this.number = number;
        this.locomotive = locomotive;
        railwayCarriages = new RailwayCarriage[10];
    }

    //Добавление вагона в массив в конец поезда
    public void addRailwayCarriageToTheEnd(RailwayCarriage railwayCarriage) {
        boolean flag = false;
        for (int i = 0; i < railwayCarriages.length; i++) {
            if (railwayCarriages[i] == null) {
                railwayCarriages[i] = railwayCarriage;
                flag = true;
                return;
            }
        }
        if (!flag) System.out.println("Поезд заполнен, добавление новых вагонов невозможно");
    }

    //Добавление вагона в массив в середину поезда со смещением
    public void addRailwayCarriageToTheMiddle(RailwayCarriage railwayCarriage) {
        int countRailwayCarriage = returnTheNumbersOfRailwayCarriage();
        if (countRailwayCarriage == 10) {
            System.out.println("Поезд заполнен, добавление новых вагонов невозможно");
            return;
        }

        for (int i = countRailwayCarriage - 1; i >= countRailwayCarriage / 2; i--) {
            railwayCarriages[i + 1] = railwayCarriages[i];
        }
        railwayCarriages[countRailwayCarriage / 2] = railwayCarriage;

    }
    //Возвращает количество вагонов
    public int returnTheNumbersOfRailwayCarriage() {
        int numberOfRailwayCarriage = 0;
        for (RailwayCarriage railwayCarriage : railwayCarriages) {
            if (railwayCarriage != null)
                numberOfRailwayCarriage++;
        }
        return numberOfRailwayCarriage;
    }
    //Удаление последнего вагона
    public void deleteLastRailwayCarriage(){
        int lastIndexRailwayCarriage = returnTheNumbersOfRailwayCarriage() - 1;
        if (lastIndexRailwayCarriage > 0) railwayCarriages[lastIndexRailwayCarriage] = null;
        else System.out.println("У поезда нет вагонов");
    }
    public void printRailwayCarriage(){
        System.out.println(Arrays.toString(railwayCarriages));
    }


}
