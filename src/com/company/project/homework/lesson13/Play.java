package com.company.project.homework.lesson13;

public class Play implements Action{
    @Override
    public void execute() {
        System.out.print("play ");
    }

    @Override
    public void nextAction() {
        execute();
    }
}