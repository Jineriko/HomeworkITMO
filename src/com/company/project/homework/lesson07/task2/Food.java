package com.company.project.homework.lesson07.task2;

public class Food {
    private String name;
    private int proteins;
    private int fats;
    private int carbohydrates;
    private int calories;

    public String getName() {
        return name;
    }

    public int getProteins() {
        return proteins;
    }

    public int getFats() {
        return fats;
    }

    public int getCarbohydrates() {
        return carbohydrates;
    }

    public int getCalories() {
        return calories;
    }

    public Food(String name, int proteins, int fats, int carbohydrates, int calories) {
        if (name == null && name.isEmpty())
            throw new IllegalArgumentException("Имя продукта не может быть пустым");
        if (proteins < 0)
            throw new IllegalArgumentException("Количество белков не может быть отрицательным");
        if (fats < 0)
            throw new IllegalArgumentException("Количество жиров не может быть отрицательным");
        if (carbohydrates < 0)
            throw new IllegalArgumentException("Количество углеводов не может быть отрицательным");
        if (calories <= 0)
            throw new IllegalArgumentException("Количество каллорий должно быть больше 0");
        this.name = name;
        this.proteins = proteins;
        this.fats = fats;
        this.carbohydrates = carbohydrates;
        this.calories = calories;
    }

    public Food(String name, int proteins, int fats, int carbohydrates) {
        if (name == null && name.isEmpty())
            throw new IllegalArgumentException("Имя продукта не может быть пустым");
        if (proteins < 0)
            throw new IllegalArgumentException("Количество белков не может быть отрицательным");
        if (fats < 0)
            throw new IllegalArgumentException("Количество жиров не может быть отрицательным");
        if (carbohydrates < 0)
            throw new IllegalArgumentException("Количество углеводов не может быть отрицательным");
        this.name = name;
        this.proteins = proteins;
        this.fats = fats;
        this.carbohydrates = carbohydrates;

    }

    public Food(String name, int proteins, int fats) {
        if (name == null && name.isEmpty())
            throw new IllegalArgumentException("Имя продукта не может быть пустым");
        if (proteins < 0)
            throw new IllegalArgumentException("Количество белков не может быть отрицательным");
        if (fats < 0)
            throw new IllegalArgumentException("Количество жиров не может быть отрицательным");
        this.name = name;
        this.proteins = proteins;
        this.fats = fats;
    }

    public Food(String name, int proteins) {
        if (name == null && name.isEmpty())
            throw new IllegalArgumentException("Имя продукта не может быть пустым");
        if (proteins < 0)
            throw new IllegalArgumentException("Количество белков не может быть отрицательным");
        this.name = name;
        this.proteins = proteins;
    }
}
