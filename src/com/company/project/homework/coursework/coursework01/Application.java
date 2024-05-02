package com.company.project.homework.coursework.coursework01;

import java.time.LocalDate;

public class Application {
    public static void main(String[] args) { // для тестирования
        Fitness fitness = new Fitness();
        Owner owner01 = new Owner("Alex", "Smith", LocalDate.of(1995, 2, 24));
        Owner owner02 = new Owner("Elena", "White", LocalDate.of(1999, 11, 5));
        Owner owner03 = new Owner("Bob", "Anderson", LocalDate.of(2004, 5, 13));
        Owner owner04 = new Owner("John", "Catswill", LocalDate.of(1988, 2, 1));
        Subscription subscription01 = new Subscription("01", owner01, Subscription.TypeOFSubscription.ONETIME);
        Subscription subscription02 = new Subscription("02", owner02, Subscription.TypeOFSubscription.DAYTIME);
        Subscription subscription03 = new Subscription("03", owner03, Subscription.TypeOFSubscription.FULLTIME);
        Subscription subscription04 = new Subscription("04", owner04, Subscription.TypeOFSubscription.DAYTIME);

        fitness.addSubscription(Fitness.TypeOfFitness.GYM, subscription01);
        fitness.addSubscription(Fitness.TypeOfFitness.GYM, subscription02);
        fitness.addSubscription(Fitness.TypeOfFitness.GYM, subscription03);
        fitness.addSubscription(Fitness.TypeOfFitness.POOL, subscription04);
        fitness.addSubscription(Fitness.TypeOfFitness.GROUP_CLASSES, subscription04);
        System.out.println();

        for (int i = 0; i < 22; i++) {
            Subscription subscription = new Subscription(i + "", owner01, Subscription.TypeOFSubscription.ONETIME);
            fitness.addSubscription(Fitness.TypeOfFitness.POOL, subscription);
        }

        System.out.println();
        fitness.getInformation(Fitness.TypeOfFitness.GYM);
        fitness.getInformation(Fitness.TypeOfFitness.POOL);
        fitness.getInformation(Fitness.TypeOfFitness.GROUP_CLASSES);
    }
}