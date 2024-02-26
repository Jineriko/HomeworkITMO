package com.company.project.homework.lesson07.task2;

public class MyApprovedProducts {
    private int maxCountProtein = 100;
    private int maxCountFats = 150;
    private int maxCountCarbohydrates = 200;
    private int maxCountCalories = 2000;

    public boolean checkFood(Food food){
        if (food.getProteins() > maxCountProtein){
            System.out.println("В продукте слишком много протеина");
            return false;
        } else if (food.getFats() > maxCountFats){
            System.out.println("В продукте слишком много жиров");
            return false;
        } else if (food.getCarbohydrates() > maxCountCarbohydrates){
            System.out.println("В продукте слишком много углеводов");
            return false;
        } else if (food.getCalories() > maxCountCalories){
            System.out.println("В продукте слишком много каллорий");
            return false;
        } else {
            System.out.println("Продукта полностью соответствуют заявленным разрешениям");
            return true;
        }
    }
}
