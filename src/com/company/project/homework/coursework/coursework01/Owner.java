package com.company.project.homework.coursework.coursework01;

import java.time.LocalDate;

public class Owner {
    private String name;
    private String lastName;
    private LocalDate localDate;

    public Owner(String name, String lastName, LocalDate localDate) {
        if (name == null) throw new IllegalArgumentException("Поле имя не может быть пустым");
        if (lastName == null) throw new IllegalArgumentException("Поле фамилия не может быть пустым");
        if (localDate == null || localDate.isAfter(LocalDate.now())
                || localDate.getYear() < 18 || localDate.getYear() > 110)
            throw new IllegalArgumentException("Некорректно указан год рождения");
        this.name = name;
        this.lastName = lastName;
        this.localDate = localDate;
    }

    @Override
    public String toString() {
        return name + " " + lastName;
    }
}