package com.company.project.homework.lesson16;

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
        fruitStorage.getSortedArray(new FruitToStorageInfo.CountComparator()); //сортировка по количеству
        fruitStorage.printArrayFruitToStorage();
        fruitStorage.getSortedArray(new FruitToStorageInfo.PriceComparator()); //сортировка по цене
        fruitStorage.printArrayFruitToStorage();
        fruitStorage.getSortedArray(new FruitToStorageInfo.CountAndPriceComparator()); //сортировка по количеству и цене
        fruitStorage.printArrayFruitToStorage();
        fruitStorage.getSortedArray(new FruitToStorageInfo.FruitTypeComparator()); //сортировка по типу (в зависимости по добавлению в enum)
        fruitStorage.printArrayFruitToStorage();
    }
}