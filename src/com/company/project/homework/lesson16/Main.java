package com.company.project.homework.lesson16;

import java.util.Comparator;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        FruitStorage fruitStorage = new FruitStorage(100);
        //создание объектов фрутов
        FruitToStorageInfo apple1 = new FruitToStorageInfo(FruitToStorageInfo.FruitType.APPLE, 124, 20);
        FruitToStorageInfo pear1 = new FruitToStorageInfo(FruitToStorageInfo.FruitType.PEAR, 150, 6);
        FruitToStorageInfo banana1 = new FruitToStorageInfo(FruitToStorageInfo.FruitType.BANANA, 100, 30);
        FruitToStorageInfo apricot1 = new FruitToStorageInfo(FruitToStorageInfo.FruitType.APRICOT, 200, 12);

        FruitToStorageInfo apple2 = new FruitToStorageInfo(FruitToStorageInfo.FruitType.APPLE, 170, 14);
        FruitToStorageInfo pear2 = new FruitToStorageInfo(FruitToStorageInfo.FruitType.PEAR, 90, 15);
        //добавление в коллекцию
        fruitStorage.addToStorage(apple1);
        fruitStorage.addToStorage(pear1);
        fruitStorage.addToStorage(banana1);
        fruitStorage.addToStorage(apricot1);
        fruitStorage.addToStorage(apple2);
        fruitStorage.addToStorage(pear2);
        // тестирование методов класса FruitStorage
        System.out.println(fruitStorage.getNumberOfFruitsByType(FruitToStorageInfo.FruitType.APPLE));
        System.out.println(fruitStorage.getNumberOfEmptySlots());
        System.out.println(fruitStorage.getFruitsByTypeAndPrice(FruitToStorageInfo.FruitType.APPLE, 150));
        System.out.println(fruitStorage.getMinPriceByType(FruitToStorageInfo.FruitType.APPLE));
        //вывод на экран коллекции
        fruitStorage.printArrayFruitToStorage();
        fruitStorage.increasePrice(20);
        fruitStorage.printArrayFruitToStorage();
        //вывод на экран с учетом сортировки
        fruitStorage.getSortedArray().sort((FruitToStorageInfo fruit1, FruitToStorageInfo fruit2) -> //сортировка по количеству
                Integer.compare(fruit2.getCount(), fruit1.getCount()));
        fruitStorage.printArrayFruitToStorage();
        fruitStorage.getSortedArray().sort((fruit1, fruit2) -> //сортировка по цене
                Integer.compare((int) fruit1.getPrice(), (int) fruit2.getPrice()));
        fruitStorage.printArrayFruitToStorage();
        fruitStorage.getSortedArray().sort((fruit1, fruit2) -> { //сортировка по количеству и цене
            if (fruit1.getCount() == fruit2.getCount())
                return Integer.compare((int) fruit2.getPrice(), (int) fruit1.getPrice());
            else
                return Integer.compare(fruit1.getCount(), fruit2.getCount());
        });
        fruitStorage.printArrayFruitToStorage();
        fruitStorage.getSortedArray().sort((fruit1, fruit2) -> //сортировка по типу (в зависимости по добавлению в enum)
                Integer.compare(fruit1.getType().ordinal(), fruit2.getType().ordinal()));
        fruitStorage.printArrayFruitToStorage();
    }
}