package com.company.project.homework.lesson13;

public class Eat implements Action{
    @Override
    public void execute() {
        System.out.print("eat ");
    }

    @Override
    public void nextAction() {
        execute();
        new Drink().nextAction();
    }
}