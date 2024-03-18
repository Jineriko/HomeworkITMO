package com.company.project.homework.lesson15;

public class Main {
    public static void main(String[] args) {
        FruitStorage fruitStorage = new FruitStorage(100);

        FruitToStorageInfo apple1 = new FruitToStorageInfo(FruitToStorageInfo.FruitType.APPLE, 124, 20);
        FruitToStorageInfo pear1 = new FruitToStorageInfo(FruitToStorageInfo.FruitType.PEAR, 150, 6);
        FruitToStorageInfo banana1 = new FruitToStorageInfo(FruitToStorageInfo.FruitType.BANANA, 100, 30);
        FruitToStorageInfo apricot1 = new FruitToStorageInfo(FruitToStorageInfo.FruitType.APRICOT, 200, 12);

        FruitToStorageInfo apple2 = new FruitToStorageInfo(FruitToStorageInfo.FruitType.APPLE, 170, 14);
        FruitToStorageInfo pear2 = new FruitToStorageInfo(FruitToStorageInfo.FruitType.PEAR, 90, 15);

        fruitStorage.addToStorage(apple1);
        fruitStorage.addToStorage(pear1);
        fruitStorage.addToStorage(banana1);
        fruitStorage.addToStorage(apricot1);
        fruitStorage.addToStorage(apple2);
        fruitStorage.addToStorage(pear2);

        System.out.println(fruitStorage.getNumberOfFruitsByType(FruitToStorageInfo.FruitType.APPLE));
        System.out.println(fruitStorage.getNumberOfEmptySlots());
        System.out.println(fruitStorage.getFruitsByTypeAndPrice(FruitToStorageInfo.FruitType.APPLE, 150));
        System.out.println(fruitStorage.getMinPriceByType(FruitToStorageInfo.FruitType.APPLE));

        fruitStorage.printArrayFruitToStorage();
        fruitStorage.increasePrice(20);
        fruitStorage.printArrayFruitToStorage();
    }
}
