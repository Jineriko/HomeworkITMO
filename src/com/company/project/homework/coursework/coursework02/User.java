package com.company.project.homework.coursework.coursework02;

import com.company.project.homework.coursework.coursework02.gamePlay.StoryLine;
import com.company.project.homework.coursework.coursework02.menu.Menu;

import java.util.Scanner;

public class User {
    private String name;
    private StoryLine storyLine;
    private Scanner scanner;
    private Menu menu = new Menu();

    public User(String name) {
        this.name = name;
        storyLine = new StoryLine();
        scanner = new Scanner(System.in);
    }

    public String getName() {
        return name;
    }

    public StoryLine getStoryLine() {
        return storyLine;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Users{" +
                "name='" + name + '\'' +
                '}';
    }

    public void answerUser() { // метод, который описывает и реагирует на ввод данных юзера
        int answerUser;
        try {
            answerUser = Integer.parseInt(scanner.nextLine());
        } catch (Exception e) {
            System.out.println("Введено некорректное значение");
            return;
        }
        if (answerUser == 3) {
            menu.printMenu();
            return;
        }
        if (answerUser != 1 && answerUser != 2) {
            System.out.println("Введено некорректное значение");
            return;
        }
        storyLine.setStoryCount(storyLine.getStoryCount() + answerUser); // действие, которое продвигает сюжет вперед
    }
}
