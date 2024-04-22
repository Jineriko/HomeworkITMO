package com.company.project.homework.coursework.coursework02;

import com.company.project.homework.coursework.coursework02.gamePlay.StoryLine;

import java.util.Scanner;

public class User {
    private String name;
    private StoryLine storyLine;
    private Scanner scanner;
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
    public void answerUser(){
        int answerUser;
        try {
            answerUser = Integer.parseInt(scanner.nextLine());
        } catch (Exception e){
            System.out.println("Значение может быть только число '1' или '2'");
            return;
        }
        if (answerUser != 1 && answerUser != 2){
            System.out.println("Значение может быть только '1' или '2'");
            return;
        }
        storyLine.setStoryCount(storyLine.getStoryCount() + answerUser); // действие, которое продвигает сюжет вперед
    }
}
