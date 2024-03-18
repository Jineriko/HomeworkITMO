package com.company.project.homework.lesson15;

import java.util.Objects;

// содержит информацию о фруктах,
// которые будут добавляться на склад
public class FruitToStorageInfo {
    private final FruitType type;
    private double price; // за один фрукт
    private int count; // количество добавляемых фруктов

    // конструктор, принимающий значения всех свойств + проверки

    // доступные геттеры и сеттеры

    // equals + hashCode + toString

    public FruitToStorageInfo(FruitType type, double price, int count) {
        if (price <= 0) throw new IllegalArgumentException("Некорректная цена");
        if (count <= 0 || count > 1000000)
            throw new IllegalArgumentException("Количество не может отрицательным, 0 или больше 1000000");
        this.type = type;
        this.price = price;
        this.count = count;
    }

    public FruitType getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FruitToStorageInfo that = (FruitToStorageInfo) o;
        return Double.compare(price, that.price) == 0 && type == that.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, price, count);
    }

    @Override
    public String toString() {
        return "FruitToStorageInfo{" +
                "type=" + type +
                ", price=" + price +
                ", count=" + count +
                '}';
    }

    public enum FruitType {
        APPLE, PEAR, BANANA, APRICOT;
    }
}