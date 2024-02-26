package com.company.project.homework.lesson07.task1;

public class Mountain {
    private String name;
    private String country;
    private int height;

    public Mountain(String name, String country, int height){
        if (name.length() < 4)
            throw new IllegalArgumentException("Имя горы должно быть не менее 4 символа");
        if (country.length() < 4)
            throw new IllegalArgumentException("Название страны должно быть не менее 4 символа");
        if (height < 100)
            throw new IllegalArgumentException("Высота горы не может быть меньше 100 метров");
    }
}
