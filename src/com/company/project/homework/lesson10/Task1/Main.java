package com.company.project.homework.lesson10.Task1;

public class Main {
    public static void main(String[] args) {
        /*
### Реализовать поезд по следующим правилам:

Поезд
1. У поезда есть номер (поезд без номера существовать не может)
2. Поезд хранит ссылку на локомотив (поезд без локомотива существовать не может)
3. Локомотив хранит ссылку на первый вагон
4. Первый вагон хранит ссылку на второй и т.д. (каждый следующий вагон хранит ссылку на предыдущий)
5. Поезд может вернуть количество вагонов
6. Можно добавить вагон в конец поезда
7. Можно удалить вагон с хвоста поезда
8. Можно добавить вагон в середину со смещением последующих вагонов.

Вагон обладает следующими характеристиками:
1. номер
2. тип
3. количество мест
4. ссылка на следующий вагон
         */
        RailwayCarriage railwayCarriage1 = new RailwayCarriage("1", "electrical", (int) ((Math.random() + 1) * 20), null);
        RailwayCarriage railwayCarriage2 = new RailwayCarriage("2", "electrical", (int) ((Math.random() + 1) * 20), railwayCarriage1);
        RailwayCarriage railwayCarriage3 = new RailwayCarriage("3", "electrical", (int) ((Math.random() + 1) * 20), railwayCarriage2);
        RailwayCarriage railwayCarriage4 = new RailwayCarriage("4", "electrical", (int) ((Math.random() + 1) * 20), railwayCarriage3);
        RailwayCarriage railwayCarriage5 = new RailwayCarriage("5", "electrical", (int) ((Math.random() + 1) * 20), railwayCarriage4);
        RailwayCarriage railwayCarriage6 = new RailwayCarriage("6", "electrical", (int) ((Math.random() + 1) * 20), railwayCarriage5);
        RailwayCarriage railwayCarriage7 = new RailwayCarriage("7", "electrical", (int) ((Math.random() + 1) * 20), railwayCarriage6);
        RailwayCarriage railwayCarriage8 = new RailwayCarriage("8", "electrical", (int) ((Math.random() + 1) * 20), railwayCarriage7);

        Locomotive locomotive = new Locomotive("One", railwayCarriage1);
        Train train = new Train("1e", locomotive);

        train.addRailwayCarriageToTheEnd(railwayCarriage1);
        train.addRailwayCarriageToTheEnd(railwayCarriage2);
        train.addRailwayCarriageToTheEnd(railwayCarriage3);
        train.addRailwayCarriageToTheEnd(railwayCarriage4);
        train.addRailwayCarriageToTheEnd(railwayCarriage5);
        train.addRailwayCarriageToTheEnd(railwayCarriage6);
        train.addRailwayCarriageToTheEnd(railwayCarriage7);
        train.printRailwayCarriage();

        train.addRailwayCarriageToTheMiddle(railwayCarriage8);
        train.printRailwayCarriage();

        train.deleteLastRailwayCarriage();
        train.printRailwayCarriage();
    }
}
