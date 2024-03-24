package com.company.project.homework.lesson18.lambda;

import com.company.project.homework.lesson16.FruitToStorageInfo;

import java.time.LocalDateTime;
import java.util.Comparator;

public class Task{
    private int id;
    private String title;
    private Status status;
    private LocalDateTime createdAt;
    private LocalDateTime closeTo;

    // геттеры, сеттеры и д.т


    public Task(int id, String title, Status status, LocalDateTime createdAt, LocalDateTime closeTo) {
        this.id = id;
        this.title = title;
        this.status = status;
        this.createdAt = createdAt;
        this.closeTo = closeTo;
    }

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

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", status=" + status +
                ", createdAt=" + createdAt +
                ", closeTo=" + closeTo +
                '}';
    }

    public enum Status{
        NEW, IN_PROGRESS, CLOSED
    }
    public static class CloseToComparator implements Comparator<Task>{
        @Override
        public int compare(Task o1, Task o2) {
            return o1.closeTo.getDayOfYear() - o2.closeTo.getDayOfYear();
        }
    }
}