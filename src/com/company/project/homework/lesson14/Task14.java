package com.company.project.homework.lesson14;

public class Task14 {

    public static <T extends Vehicle, K extends T> K[] task01(T first, K second, Car car) {
        // какие методы можно вызвать у second?
        // какие из аргументов можно добавить в массив, а какие нет и почему
        K[] arr = {};
        return arr;
        // 1. У second можно вызвать методы Vehicle и его супертипов (Object)
        // 2. В массив можно добавить аргументы всех наследников класса Vehicle,
        //  т.к тип K ограничивается классом Vehicle, поэтому в массив мы можем добавить его
        //  или его наследников благодаря полиморфизму.
        //  Т.е. добавить экземпляры классов Car, MiniCar, Train, Bus.
        //  Экземпляры класса Vehicle добавить не можем, т.к. он абстрактный
    }

    public static void main(String[] args) {
        // Задание 1
        // какие типы можно указать в угловых скобках вместо ??? и
        // экземпляры каких классов передать?

        // Task14.<Vehicle, ???>task01();
        // вместо ??? можно написать класс, который наследуется от Vehicle.
        // Можно конечно и сам Vehicle, но в этом нет смысла, т.к. буква T уже использует его
        Task14.<Vehicle, Car>task01(new Train("1e", 2, true),
                new Car(Repaintable.Color.BLACK, "fgb1"), new Car(Repaintable.Color.RED, "1234bb"));


        // Task14.<???, MiniCar >task01();
        // вместо ??? может быть только класс Car, т.к. в дженерике метода K ограничивается T, а т.к. K == MiniСar,
        // то ограничение может быть только от класса Car
        Task14.<Car, MiniCar>task01(new Car(Repaintable.Color.RED, "fb4"),
                new MiniCar(Repaintable.Color.BLACK, "bd2"), new Car(Repaintable.Color.GOLD, "4gg4"));

        // Task14.<Train, ???>task01();
        // вместо ??? можно поставить только класс Train, т.к. у класса Train нет наследников,
        // поэтому класс Train - максимальное ограничение
        Task14.<Train, Train>task01(new Train("vv4", 24, true),
                new Train("vv5", 224, false), new Car(Repaintable.Color.ORANGE, "gt4"));


        // Задание 2
        // Написать метод, который принимает на вход массив чисел (использовать дженерик)
        // и возвращает PairContainer, где ключи - сумма четных элементов
        // значения - сумма нечетных элементов
    }

    public <T> PairContainer<Integer, T[]> bb(T[] elem) {
        // Проверка передаваемого массива на null и на принадлежность к числам
        if (elem == null) throw new IllegalArgumentException();
        if (!(elem[0] instanceof Number)) return null;

        PairContainer pairContainer = new PairContainer();
        double sumEven = 0.0;
        double sumOdd = 0.0;

        for (int i = 0; i < elem.length; i++) {
            if (i % 2 == 0)
                sumEven = sumEven + (int) elem[i];
            else
                sumOdd = sumOdd + (double) elem[i];
        }

        pairContainer.setKey(sumEven);
        pairContainer.setValue(sumOdd);
        return pairContainer;
    }
}