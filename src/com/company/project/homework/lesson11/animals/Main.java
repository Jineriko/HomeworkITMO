package com.company.project.homework.lesson11.animals;

public class Main {
    public static void main(String[] args) {
        Wolf wolf1 = new Wolf(new String[]{"meat", "rabbit", "chicken","water"}, "black");
        Wolf wolf2 = new Wolf(new String[]{"meat", "rabbit", "bird","water"}, "black");
        Wolf wolf3 = new Wolf(new String[]{"meat", "rabbit", "chicken","water"}, "black");
        Wolf wolf4 = new Wolf(new String[]{"rabbit", "meat", "chicken","water"}, "black");

        String[] eatForWolf = {"meat", "rabbit", "chicken","water"};
        Wolf wolf5 = new Wolf(eatForWolf, "black");

        System.out.println(wolf1.equals(wolf2));
        System.out.println(wolf2.equals(wolf3));
        System.out.println(wolf3.equals(wolf1));
        System.out.println(wolf4.equals(wolf1));
        System.out.println(wolf5.equals(wolf1));
    }
}
