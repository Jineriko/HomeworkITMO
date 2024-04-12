package com.company.project.homework.coursework.coursework02;

public class Action {
    private final int answer1 = 1;
    private final int answer2 = 2;

    private Action action1;
    private Action action2;

    public Action choiceAction (int answer){
        if (answer == answer1) return action1;
        if (answer == answer2) return action2;
        else throw new IllegalArgumentException("Некорректно указано значение выбора");
    }

    public void nextAction (Action action){

    }
}
