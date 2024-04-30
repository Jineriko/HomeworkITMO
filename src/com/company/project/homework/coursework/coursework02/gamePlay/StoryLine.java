package com.company.project.homework.coursework.coursework02.gamePlay;

import com.company.project.homework.coursework.coursework02.menu.Menu;

import java.util.List;

public class StoryLine { // класс для описания сюжета
    private int storyCount; // идентификатор сюжета, показывает продвижения по сюжету
    private int previousStoryCount; // хранит предыдущее значение storyCount
    private static List<Paragraph> paragraphList = Paragraph.getParagraphList();

    public void paragraph01_1() { // Лисенок
        System.out.println();
        storyCount = 1;
        previousStoryCount = 1;
        paragraphList.get(0).paragraphNameOutput();
        paragraphList.get(0).paragraphTextOutput();
        System.out.println();
        System.out.print("1. ");
        paragraphList.get(1).paragraphNameOutput();
        System.out.print("2. ");
        paragraphList.get(2).paragraphNameOutput();
        System.out.print("3. " + Menu.getExitToMenu());
        System.out.println();
    }

    public void paragraph02_1() { // Отправиться на поиски
        previousStoryCount = 3;
        System.out.println();
        paragraphList.get(2).paragraphTextOutput();
        System.out.println();
        System.out.print("1. ");
        paragraphList.get(3).paragraphNameOutput();
        System.out.print("2. ");
        paragraphList.get(4).paragraphNameOutput();
        System.out.print("3. " + Menu.getExitToMenu());
        System.out.println();
    }

    public void paragraph02_2() { // Вернуться домой
        previousStoryCount = 2;
        System.out.println();
        paragraphList.get(1).paragraphTextOutput();
        System.out.println();
        System.out.println("Конец");
        storyCount = 0;
    }

    public void paragraph03_1() { // Попытаться разузнать о Бельчонке у лесных жителей
        previousStoryCount = 4;
        System.out.println();
        paragraphList.get(3).paragraphTextOutput();
        System.out.println();
        System.out.print("1. ");
        paragraphList.get(5).paragraphNameOutput();
        System.out.print("2. ");
        paragraphList.get(6).paragraphNameOutput();
        storyCount = 10;
        System.out.print("3. " + Menu.getExitToMenu());
        System.out.println();
    }

    public void paragraph03_2() { // Искать Бельчонка в одиночку
        previousStoryCount = 5;
        System.out.println();
        paragraphList.get(4).paragraphTextOutput();
        System.out.println();
        System.out.println("Конец");
        storyCount = 0;
    }

    public void paragraph04_1() { // Расспросить Сову
        previousStoryCount = 11;
        System.out.println();
        paragraphList.get(5).paragraphTextOutput();
        System.out.println();
        System.out.print("1. ");
        paragraphList.get(7).paragraphNameOutput();
        System.out.print("2. ");
        paragraphList.get(4).paragraphNameOutput();
        storyCount = 20;
        System.out.print("3. " + Menu.getExitToMenu());
        System.out.println();
    }

    public void paragraph04_2() { // Расспросить Волка
        previousStoryCount = 12;
        System.out.println();
        paragraphList.get(6).paragraphTextOutput();
        System.out.println();
        System.out.print("1. ");
        paragraphList.get(4).paragraphNameOutput();
        System.out.print("2. ");
        paragraphList.get(1).paragraphNameOutput();
        storyCount = 30;
        System.out.print("3. " + Menu.getExitToMenu());
        System.out.println();
    }

    public void paragraph05_1() { // Поверить Сове и отправиться вглубь леса
        previousStoryCount = 21;
        System.out.println();
        paragraphList.get(7).paragraphTextOutput();
        System.out.println();
        System.out.print("1. ");
        paragraphList.get(4).paragraphNameOutput();
        System.out.print("2. ");
        paragraphList.get(8).paragraphNameOutput();
        storyCount = 40;
        System.out.print("3. " + Menu.getExitToMenu());
        System.out.println();
    }

    public void paragraph06_1() { // Нужно воспользоваться шансом и раздобыть мёд
        previousStoryCount = 42;
        System.out.println();
        paragraphList.get(8).paragraphTextOutput();
        System.out.println();
        System.out.print("1. ");
        paragraphList.get(9).paragraphNameOutput();
        System.out.print("2. ");
        paragraphList.get(10).paragraphNameOutput();
        System.out.print("3. " + Menu.getExitToMenu());
        System.out.println();
    }

    public void paragraph07_1() { // Нужно попытаться выкрасть мёд немедленно
        previousStoryCount = 44;
        System.out.println();
        paragraphList.get(10).paragraphTextOutput();
        System.out.println();
        System.out.println("Конец");
        storyCount = 0;
    }

    public void paragraph07_2() { // Подождать, вдруг пчёлы улетят
        previousStoryCount = 43;
        System.out.println();
        paragraphList.get(9).paragraphTextOutput();
        System.out.println();
        System.out.print("1. ");
        paragraphList.get(11).paragraphNameOutput();
        System.out.print("2. ");
        paragraphList.get(12).paragraphNameOutput();
        storyCount = 50;
        System.out.print("3. " + Menu.getExitToMenu());
        System.out.println();
    }

    public void paragraph08_1() { // Поесть немного и передохнуть
        previousStoryCount = 51;
        System.out.println();
        paragraphList.get(11).paragraphTextOutput();
        System.out.println();
        System.out.println("Конец");
        storyCount = 0;
    }

    public void paragraph08_2() { // Скорее отнести мёд Медвежонку
        previousStoryCount = 52;
        System.out.println();
        paragraphList.get(12).paragraphTextOutput();
        System.out.println();
        System.out.print("1. ");
        paragraphList.get(1).paragraphNameOutput();
        System.out.print("3. " + Menu.getExitToMenu());
        System.out.println();
    }

    public int getStoryCount() {
        return storyCount;
    }

    public int getPreviousStoryCount() {
        return previousStoryCount;
    }

    public void setStoryCount(int storyCount) {
        this.storyCount = storyCount;
    }

    public void setPreviousStoryCount(int previousStoryCount) {
        this.previousStoryCount = previousStoryCount;
    }
}
