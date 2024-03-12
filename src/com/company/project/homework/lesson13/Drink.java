package com.company.project.homework.lesson13;

public class Drink implements Action{
    @Override
    public void execute() {
        System.out.print("drink ");
    }

    @Override
    public void nextAction() {
        execute();
        new Play().nextAction();
    }
}