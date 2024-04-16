package com.company.project.homework.coursework.coursework02.gamePlay;

import java.util.List;

public class StoryLine {
    private static int storyCount;
    private static List<Paragraph> paragraphList = Paragraph.getParagraphList();
    public void startStory(){ // Лисенок
        storyCount = 1;
        paragraphList.get(0).paragraphNameOutput();
        paragraphList.get(0).paragraphTextOutput();
        System.out.println();
        System.out.print("1. ");
        paragraphList.get(1).paragraphNameOutput();
        System.out.print("2. ");
        paragraphList.get(2).paragraphNameOutput();
    }
    public void paragraph02_1(){ // Отправиться на поиски
        paragraphList.get(2).paragraphTextOutput();
        System.out.println();
        System.out.print("1. ");
        paragraphList.get(3).paragraphNameOutput();
        System.out.print("2. ");
        paragraphList.get(4).paragraphNameOutput();
    }
    public void paragraph02_2(){ // Вернуться домой
        paragraphList.get(1).paragraphTextOutput();
        System.out.println();
        System.out.println("Конец");
        storyCount = 0;
    }
    public void paragraph03_1(){ // Попытаться разузнать о Бельчонке у лесных жителей
        paragraphList.get(3).paragraphTextOutput();
        System.out.println();
        System.out.print("1. ");
        paragraphList.get(5).paragraphNameOutput();
        System.out.print("2. ");
        paragraphList.get(6).paragraphNameOutput();
        storyCount = 10;
    }
    public void paragraph03_2(){ // Искать Бельчонка в одиночку
        paragraphList.get(4).paragraphTextOutput();
        System.out.println();
        System.out.println("Конец");
        storyCount = 0;
    }
    public void paragraph04_1(){ // Расспросить Сову
        paragraphList.get(5).paragraphTextOutput();
        System.out.println();
        System.out.print("1. ");
        paragraphList.get(7).paragraphNameOutput();
        System.out.print("2. ");
        paragraphList.get(4).paragraphNameOutput();
        storyCount = 20;
    }
    public void paragraph04_2(){ // Расспросить Волка
        paragraphList.get(6).paragraphTextOutput();
        System.out.println();
        System.out.print("1. ");
        paragraphList.get(4).paragraphNameOutput();
        System.out.print("2. ");
        paragraphList.get(1).paragraphNameOutput();
        storyCount = 30;
    }
    public void paragraph05_1(){ // Поверить Сове и отправиться вглубь леса
        paragraphList.get(7).paragraphTextOutput();
        System.out.println();
        System.out.print("1. ");
        paragraphList.get(4).paragraphNameOutput();
        System.out.print("2. ");
        paragraphList.get(8).paragraphNameOutput();
        storyCount = 40;
    }
    public void paragraph06_1(){ // Нужно воспользоваться шансом и раздобыть мёд
        paragraphList.get(8).paragraphTextOutput();
        System.out.println();
        System.out.print("1. ");
        paragraphList.get(9).paragraphNameOutput();
        System.out.print("2. ");
        paragraphList.get(10).paragraphNameOutput();
    }
    public void paragraph07_1(){ // Нужно попытаться выкрасть мёд немедленно
        paragraphList.get(10).paragraphTextOutput();
        System.out.println();
        System.out.println("Конец");
        storyCount = 0;
    }
    public void paragraph07_2(){ // Подождать, вдруг пчёлы улетят
        paragraphList.get(9).paragraphTextOutput();
        System.out.println();
        System.out.print("1. ");
        paragraphList.get(11).paragraphNameOutput();
        System.out.print("2. ");
        paragraphList.get(12).paragraphNameOutput();
        storyCount = 50;
    }
    public void paragraph08_1(){ // Поесть немного и передохнуть
        paragraphList.get(11).paragraphTextOutput();
        System.out.println();
        System.out.println("Конец");
        storyCount = 0;
    }
    public void paragraph08_2(){ // Скорее отнести мёд Медвежонку
        paragraphList.get(12).paragraphTextOutput();
        System.out.println();
        System.out.print("1. ");
        paragraphList.get(1).paragraphNameOutput();
    }
    public int getStoryCount() {
        return storyCount;
    }
    public void setStoryCount(int storyCount) {
        StoryLine.storyCount = storyCount;
    }
}
