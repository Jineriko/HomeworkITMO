package com.company.project.homework.lesson10.Task1;

public class Locomotive {
    private String number;
    private RailwayCarriage railwayCarriage;

    public Locomotive(String number, RailwayCarriage railwayCarriage) {
        if (number == null) throw new IllegalArgumentException("Имя локомотива не может быть пустым");
        this.number = number;
        this.railwayCarriage = railwayCarriage;
    }
}
