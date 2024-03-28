package com.company.project.homework.coursework.coursework01;

import java.time.LocalDateTime;
import java.util.Arrays;

public class Fitness {
    private static Subscription[] subscriptionsGym;
    private static Subscription[] subscriptionsPool;
    private static Subscription[] subscriptionsGroupClasses;
    private static final int maxSubscription = 20;
    private TypeOfFitnessArea typeOfFitnessArea;

    public Fitness() {
        subscriptionsGym = new Subscription[maxSubscription];
        subscriptionsPool = new Subscription[maxSubscription];
        subscriptionsGroupClasses = new Subscription[maxSubscription];
    }

    public enum TypeOfFitnessArea {
        GYM, POOL, GROUPCLASSES;

        public Subscription[] getSubscription() { // метод получение массива по типу enum
            return this == GYM ? subscriptionsGym :
                    this == POOL ? subscriptionsPool :
                            subscriptionsGroupClasses;
        }
    }

    public static void addSubscription(Fitness.TypeOfFitnessArea fitnessArea, Subscription subscription) {
        if (subscription == null || fitnessArea == null) throw new IllegalArgumentException(); // проверка на null
        if (!Arrays.asList(fitnessArea.getSubscription()).contains(null)) { // проверка на место в массиве
            System.out.println("В текущей зоне выдано максимальное количество абонементов");
            return;
        }
        if (subscription.getRegistrationExpirationDate().isBefore(LocalDateTime.now())) { // проверка не просрочен ли абонемент
            System.out.println("Абонемент просрочен");
            return;
        }
        if (Arrays.asList(subscriptionsGym).contains(subscription) || // проверка на повторную регистрацию абонемента
                Arrays.asList(subscriptionsPool).contains(subscription) ||
                Arrays.asList(subscriptionsGroupClasses).contains(subscription)) {
            System.out.println("Абонемент уже зарегистрирован");
            return;
        }
        Arrays.asList(fitnessArea.getSubscription()).add(subscription); // добавление абонемента в массив
        System.out.println(subscription + "получил абонемент в зоне " + fitnessArea + ". Дата регистрации " +
                subscription.getDateOfRegistration());
    }

    public void getInformation(Fitness.TypeOfFitnessArea fitnessArea) {
        int counter = 0;
        for (int i = 0; i < maxSubscription; i++) {
            if (fitnessArea.getSubscription()[i] != null) counter++;
        }
        System.out.println("Количество свободных мест " + counter + " в текущей зоне" + fitnessArea);
    }
}