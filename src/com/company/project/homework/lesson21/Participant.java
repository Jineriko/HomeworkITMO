package com.company.project.homework.lesson21;

public class Participant {
    private int id;
    private String name;
    // доступен в данный момент
    private boolean active;
    // опыт
    private int experience;
    // максимальное количество задач, которые может выполнить
    private int maxTasks;

    // геттеры, сеттеры и д.т


    public Participant(int id, String name, boolean active, int experience, int maxTasks) {
        if (id < 1 || name == null || experience < 0 || maxTasks < 1) throw new IllegalArgumentException();
        this.id = id;
        this.name = name;
        this.active = active;
        this.experience = experience;
        this.maxTasks = maxTasks;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public boolean isActive() {
        return active;
    }

    public int getExperience() {
        return experience;
    }

    public int getMaxTasks() {
        return maxTasks;
    }
}