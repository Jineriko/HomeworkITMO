package com.company.project.homework.lesson10.Task1;

public class RailwayCarriage {
    private String number;
    private String type;
    private int numberOfSeats;
    private RailwayCarriage railwayCarriage;

    @Override
    public String toString() {
        return "number='" + number;
    }

    public RailwayCarriage(String number, String type, int numberOfSeats, RailwayCarriage railwayCarriage) {
        if (number == null) throw new IllegalArgumentException("Имя вагона не может быть пустым");
        if (type == null) throw new IllegalArgumentException("Тип вагона не может быть пустым");
        if (numberOfSeats < 0) throw new IllegalArgumentException("Количество мест в вагоне не может быть отрицательным");
        this.number = number;
        this.type = type;
        this.numberOfSeats = numberOfSeats;
        this.railwayCarriage = railwayCarriage;

    }
}
