package com.company.project.homework.lesson21;

public class TasksTrackerStatistic {
    public int numberOfClosed; // количество закрытых задач
    public int numberOfParticipants; // общее количество исполнителей
    public int numberOfFailed; // просрочена и не закрыта
    public int numberOfInProgress; // в процессе

    // геттеры и сеттеры

    public int getNumberOfClosed() {
        return numberOfClosed;
    }

    public int getNumberOfParticipants() {
        return numberOfParticipants;
    }

    public int getNumberOfFailed() {
        return numberOfFailed;
    }

    public int getNumberOfInProgress() {
        return numberOfInProgress;
    }

    public void setNumberOfClosed(int numberOfClosed) {
        this.numberOfClosed = numberOfClosed;
    }

    public void setNumberOfParticipants(int numberOfParticipants) {
        this.numberOfParticipants = numberOfParticipants;
    }

    public void setNumberOfFailed(int numberOfFailed) {
        this.numberOfFailed = numberOfFailed;
    }

    public void setNumberOfInProgress(int numberOfInProgress) {
        this.numberOfInProgress = numberOfInProgress;
    }
}