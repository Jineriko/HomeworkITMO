package com.company.project.homework.coursework.coursework01;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;

public class Fitness {
    private static Subscription[] subscriptionsGym;
    private static Subscription[] subscriptionsPool;
    private static Subscription[] subscriptionsGroupClasses;
    private static final int maxSubscription = 20;

    public Fitness() {
        subscriptionsGym = new Subscription[maxSubscription];
        subscriptionsPool = new Subscription[maxSubscription];
        subscriptionsGroupClasses = new Subscription[maxSubscription];
    }

    public enum TypeOfFitness { // хранит зоны фитнеса
        GYM, POOL, GROUP_CLASSES;
    }

    public Subscription[] getSubscription(TypeOfFitness type) { // получение массива абонементов, в зависимости от зоны фитнеса
        Subscription[] temp = new Subscription[maxSubscription];
        switch (type) {
            case GYM -> temp = subscriptionsGym;
            case POOL -> temp = subscriptionsPool;
            case GROUP_CLASSES -> temp = subscriptionsGroupClasses;
            default -> {
                System.out.println("Неверно указан тип фитнеса");
                return null;
            }
        }
        return temp;
    }

    public void addSubscription(TypeOfFitness fitnessArea, Subscription subscription) { // метод добавления абонемента в массив
        if (subscription == null || fitnessArea == null) { // проверка на null
            System.out.println("Зона фитнеса или абонемент не может быть null");
            return;
        }
        if (!Arrays.asList(getSubscription(fitnessArea)).contains(null)) { // проверка на место в массиве (свободные места в зоне)
            System.out.println("В текущей зоне " + fitnessArea + " выдано максимальное количество абонементов");
            return;
        }
        if (subscription.getRegistrationExpirationDate().isBefore(LocalDateTime.now())) { // проверка не просрочен ли абонемент
            System.out.println("Абонемент просрочен");
            return;
        }
        if (subscription.getType() == Subscription.TypeOFSubscription.ONETIME) { // проверка абонемента на зону, в которую пытаются пройти
            if (fitnessArea != TypeOfFitness.POOL && fitnessArea != TypeOfFitness.GYM) {
                System.out.println("В зону " + fitnessArea + " нельзя пройти по этому абонементу");
                return;
            }
        } else if (subscription.getType() == Subscription.TypeOFSubscription.DAYTIME) {
            if (fitnessArea != TypeOfFitness.GROUP_CLASSES && fitnessArea != TypeOfFitness.GYM) {
                System.out.println("В зону " + fitnessArea + " нельзя пройти по этому абонементу");
                return;
            }
        }
        if (Arrays.asList(subscriptionsGym).contains(subscription) || // проверка на повторную регистрацию абонемента
                Arrays.asList(subscriptionsPool).contains(subscription) ||
                Arrays.asList(subscriptionsGroupClasses).contains(subscription)) {
            System.out.println("Не удалось добавить абонемент. Абонемент уже зарегистрирован");
            return;
        }
        for (int i = 0; i < maxSubscription; i++) { // добавление абонемента в массив
            if (getSubscription(fitnessArea)[i] == null) {
                getSubscription(fitnessArea)[i] = subscription;
                System.out.println(subscription + "получил абонемент в зоне " + fitnessArea + ". Абонемент - " +
                        subscription.getType() + ". Абонемент действует до " +
                        LocalDate.from(subscription.getRegistrationExpirationDate()) + ". Часы посещения с " +
                        subscription.getStartHour() + " до " + subscription.getEndHour());
                return;
            }
        }
    }

    public void getInformation(TypeOfFitness fitnessArea) { // получение информации о количестве свободных мест, в зависимости от зоны фитнеса
        int counter = 0;
        for (int i = 0; i < maxSubscription; i++) {
            if (getSubscription(fitnessArea)[i] != null) counter++;
        }
        System.out.println("Количество свободных мест " + (maxSubscription - counter) + " в текущей зоне " + fitnessArea);
    }
}