package com.company.project.homework.lesson07.task1;

public class Climber {
    private String name;
    private String address;

    public String getName() {
        return name;
    }

    public Climber(String name, String address){
        if (name.length() < 3)
            throw new IllegalArgumentException("Имя альпиниста должно быть не менее 3 символов");
        if (address.length() < 5)
            throw new IllegalArgumentException("Адресс должен быть не менее 5 символов");
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Climber{" +
                "name='" + name + '\'' +
                '}';
    }
}
