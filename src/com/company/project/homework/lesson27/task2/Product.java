package com.company.project.homework.lesson27.task2;

public class Product {
    private String id;
    private String name;
    private double price;
    private int countInStorage;

    public Product(String id, String name, double price, int countInStorage) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.countInStorage = countInStorage;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getCountInStorage() {
        return countInStorage;
    }

    public void setCountInStorage(int countInStorage) {
        this.countInStorage = countInStorage;
    }

    @Override
    public String toString() {
        return " цена: " + price + ", количество: " + countInStorage;
    }
}
