package com.company.project.homework.coursework.coursework01;

import java.time.LocalDateTime;

public class Subscription {
    private String number;
    private LocalDateTime dateOfRegistration;
    private LocalDateTime registrationExpirationDate;
    private Owner owner;
    private TypeOFSubscription type;

    Subscription(String number, LocalDateTime registrationExpirationDate, Owner owner, TypeOFSubscription type) {
        if (number == null) throw new IllegalArgumentException("Введена некорректный номер");
        if (owner == null) throw new IllegalArgumentException("Поле владельца не может быть пустым");
        if (type == null) throw new IllegalArgumentException("Тип абонемента не может быть пустым");
        dateOfRegistration = LocalDateTime.now();
        this.number = number;
        this.registrationExpirationDate = registrationExpirationDate;
        this.owner = owner;
        this.type = type;
    }

    public String getNumber() {
        return number;
    }
    public LocalDateTime getDateOfRegistration() {
        return dateOfRegistration;
    }
    public LocalDateTime getRegistrationExpirationDate() {
        return registrationExpirationDate;
    }
    public Owner getOwner() {
        return owner;
    }
    public TypeOFSubscription getType() {
        return type;
    }
    public enum TypeOFSubscription{
        ONETIME, DAYTIME, FULLTIME;
    }

    @Override
    public String toString() {
        return owner.toString();
    }
}