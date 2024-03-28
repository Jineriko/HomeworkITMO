package com.company.project.homework.lesson15;

import java.util.ArrayList;
import java.util.List;

// склад содержит информацию о добавленных фруктах+
public class FruitStorage {
    // максимальное количество фруктов
    // заполняемость зависит не от количества переданных FruitToStorageInfo,
    // а от значения свойства count
    private int numberOfSlots;

    // коллекция fruits, для хранения экземпляров FruitToStorageInfo
    // TODO: КОЛЛЕКЦИЮ ВЫБРАТЬ САМОСТОЯТЕЛЬНО
    private List<FruitToStorageInfo> arrayFruitToStorage = new ArrayList<>();

    public FruitStorage(int numberOfSlots) {
        this.numberOfSlots = numberOfSlots;
    }

    // TODO: НАПИСАТЬ РЕАЛИЗАЦИЮ СЛЕДУЮЩИХ МЕТОДОВ
    public boolean addToStorage(FruitToStorageInfo toStorageInfo) {

        // Информация о фруктах добавляется в хранилище по следующим правилам:
        // 1. fruit не может быть null;
        // 2. fruit не может быть ссылкой на существующий элемент коллекции
        // 3. если в коллекции fruits уже есть фрукт с типом и ценой, как у toStorageInfo,
        //   увеличивать значение свойства count фрукта коллекции на значение свойства count toStorageInfo.
        //   В противном случае добавлять toStorageInfo в коллекцию fruits.
        //   numberOfSlots уменьшается на значение count добавляемого фрукта.
        // 4. в хранилище нельзя добавить больше numberOfSlots фруктов
        numberOfSlots = numberOfSlots - toStorageInfo.getCount();
        if (numberOfSlots <= 0) return false;

        if (toStorageInfo == null) return false;
        for (var arrayStorage : arrayFruitToStorage) {
            if (arrayStorage == toStorageInfo)
                return false;
        }
        if (arrayFruitToStorage.contains(toStorageInfo)) {
            int index = arrayFruitToStorage.indexOf(toStorageInfo);
            FruitToStorageInfo tempFruit = arrayFruitToStorage.get(index);
            tempFruit.setCount(tempFruit.getCount() + toStorageInfo.getCount());
            arrayFruitToStorage.add(index, tempFruit);
            return true;
        }
        arrayFruitToStorage.add(toStorageInfo);
        return true;
    }

    public void printArrayFruitToStorage(){
        System.out.println(arrayFruitToStorage);
    }

    // вернуть количество фруктов определённого типа
    public int getNumberOfFruitsByType(FruitToStorageInfo.FruitType fruitType) {
        int numberOfFruit = 0;
        for (var fruit : arrayFruitToStorage) {
            if (fruit.getType().equals(fruitType)) {
                numberOfFruit += fruit.getCount();
            }
        }
        return numberOfFruit;
    }

    // вернуть количество свободных мест в хранилище
    public int getNumberOfEmptySlots() {
        return numberOfSlots;
    }

    public void increasePrice(int value) {
        // value может быть в диапазоне [10; 30)
        // увеличить цену всех фруктов на value процентов
        if (value < 10 || value >= 30)
            throw new IllegalArgumentException("Увеличение цены может быть только от 10% до 30%");
        double increase = value / 100.0;
        for (var fruit : arrayFruitToStorage) {
            fruit.setPrice(fruit.getPrice() + fruit.getPrice() * increase);
        }
    }

    public List<FruitToStorageInfo> getFruitsByTypeAndPrice(FruitToStorageInfo.FruitType fruitType, int maxPrice) {
        // maxPrice должна быть положительной, fruitType не null
        // возвращает список, в который войдут фрукты из коллекции fruits
        // с типом fruitType и ценой не выше maxPrice
        if (maxPrice < 0 || fruitType == null)
            throw new IllegalArgumentException("Некорректно указано макс значение или фрукт");
        List<FruitToStorageInfo> getFruitsByTypeAndPriceArray = new ArrayList<>();
        for (int i = 0; i < arrayFruitToStorage.size(); i++) {
            FruitToStorageInfo tempFruit = arrayFruitToStorage.get(i);
            if (tempFruit.getType().equals(fruitType) && tempFruit.getPrice() < maxPrice)
                getFruitsByTypeAndPriceArray.add(tempFruit);
        }
        return getFruitsByTypeAndPriceArray;
    }

    public double getMinPriceByType(FruitToStorageInfo.FruitType fruitType) {
        // вернуть минимальную цену фрукта с типом fruitType
        if (fruitType == null) throw new IllegalArgumentException("значение не может быть null");

        int minPrice = Integer.MAX_VALUE;
        for (var fruit : arrayFruitToStorage) {
            if (fruit.getType().equals(fruitType)) {
                if (minPrice > fruit.getPrice())
                    minPrice = (int) fruit.getPrice();
            }
        }
        if (minPrice == Integer.MAX_VALUE) minPrice = 0;
        return minPrice;

    }


}