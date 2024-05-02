package com.company.project.homework.coursework.coursework01;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Subscription {
    private String number;
    private LocalDateTime dateOfRegistration; // регистрация абонемента
    private LocalDateTime registrationExpirationDate; // окончание действия абонемента
    private LocalTime startHour = LocalTime.of(8, 00); // время начала абонемента
    private LocalTime endHour; // время конца абонемента
    private Owner owner;
    private TypeOFSubscription type; // тип абонемента (разовый, дневной или полный)
    private final int countDaysForSubscription = 30; // количество дней в дневном и полном абонементе

    Subscription(String number, Owner owner, TypeOFSubscription type) {
        if (number == null) throw new IllegalArgumentException("Номер абонемента не может быть пустым");
        if (owner == null) throw new IllegalArgumentException("Поле владельца не может быть пустым");
        if (type == null) throw new IllegalArgumentException("Тип абонемента не может быть пустым");

        dateOfRegistration = LocalDateTime.now();
        switch (type) { // в зависимости от типа абонемента рассчитывается его период действия
            case ONETIME -> {
                endHour = LocalTime.of(22, 00);
                if (dateOfRegistration.getHour() > 22)
                    registrationExpirationDate = LocalDateTime.of(LocalDate.from(dateOfRegistration.plusDays(1)), endHour);
                else
                    registrationExpirationDate = LocalDateTime.of(LocalDate.from(dateOfRegistration), endHour);
            }
            case DAYTIME -> {
                endHour = LocalTime.of(16, 00);
                if (dateOfRegistration.getHour() > 22)
                    registrationExpirationDate = LocalDateTime.of(LocalDate.from(dateOfRegistration.plusDays(countDaysForSubscription + 1)), endHour);
                else
                    registrationExpirationDate = LocalDateTime.of(LocalDate.from(dateOfRegistration.plusDays(countDaysForSubscription)), endHour);
            }
            case FULLTIME -> {
                endHour = LocalTime.of(22, 00);
                if (dateOfRegistration.getHour() > 22)
                    registrationExpirationDate = LocalDateTime.of(LocalDate.from(dateOfRegistration.plusDays(countDaysForSubscription + 1)), endHour);
                else
                    registrationExpirationDate = LocalDateTime.of(LocalDate.from(dateOfRegistration.plusDays(countDaysForSubscription)), endHour);
            }
        }
        this.number = number;
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

    public LocalTime getStartHour() {
        return startHour;
    }

    public LocalTime getEndHour() {
        return endHour;
    }

    public Owner getOwner() {
        return owner;
    }

    public TypeOFSubscription getType() {
        return type;
    }

    public enum TypeOFSubscription {
        ONETIME, DAYTIME, FULLTIME;
    }

    @Override
    public String toString() {
        return owner.toString();
    }
}