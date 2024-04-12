package com.company.project.homework.lesson21;

import java.time.LocalDateTime;
import java.util.Set;

public class Task {
    private int id;
    private String title;
    private Status status;
    private LocalDateTime createdAt;
    private LocalDateTime closeTo;

    // геттеры, сеттеры и д.т

//
//    public Task(int id, String title, Status status, LocalDateTime closeTo) {
//        if (id < 1 || title == null || status == null || closeTo == null) throw new IllegalArgumentException();
//        this.id = id;
//        this.title = title;
//        this.status = status;
//        this.createdAt = LocalDateTime.now();
//        this.closeTo = closeTo;
//    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Status getStatus() {
        return status;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public LocalDateTime getCloseTo() {
        return closeTo;
    }

    public enum Status{
        NEW, IN_PROGRESS, CLOSED
    }

    public enum Priority{
        URGENT, HIGH, MEDIUM, LOW
    }
}