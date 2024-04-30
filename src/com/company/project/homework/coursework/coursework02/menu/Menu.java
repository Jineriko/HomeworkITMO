package com.company.project.homework.coursework.coursework02.menu;

import com.company.project.homework.coursework.coursework02.User;
import com.company.project.homework.coursework.coursework02.gamePlay.Gameplay;

import java.io.*;
import java.util.Scanner;

//Reciver
public class Menu {
    private static final String startTheGame = "Начать игру";
    private static final String quitTheGame = "Выйти из игры";
    private static final String exitToMenu = "Выйти в меню";
    private static final String returnToGame = "Вернуться к игре";
    private static final String saveTheGame = "Сохранить игру";
    private static final String loadTheGame = "Загрузить игру";
    private static boolean saveGameFlag = false; // флаг для проверки сохранения
    private static boolean startGameFlag = false; // флаг для проверки первого захода в меню
    private static User user;
    private static Gameplay gameplay;

    public static String getExitToMenu() {
        return exitToMenu;
    }


    public void start() { // создает нового юзера и запускает первый параграф
        startGameFlag = true;
        System.out.println();
        System.out.println("Введите имя игрока");
        Scanner scanner = new Scanner(System.in);
        user = new User(scanner.nextLine());
        while ("".equals(user.getName())){
            System.out.println("Имя не может быть пустым");
            user = new User(scanner.nextLine());
        }
        gameplay = new Gameplay(user);
        gameplay.startStory();
        gameplay.story();
    }

    public void exit() {
        System.exit(0);
    }

    public void resume() {
        gameplay.loadStory(user.getStoryLine().getPreviousStoryCount());
    }

    public void save() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("saves.txt"))) {
            writer.write(user.getName());
            writer.write("::");
            writer.write(user.getStoryLine().getPreviousStoryCount() + "");
        } catch (IOException e) {
            System.out.println("Ошибка при сохранении");
            ;
        }
        saveGameFlag = true;
        System.out.println();
        System.out.println("Игра сохранена");
        printMenu();
    }

    public void load() {
        try (BufferedReader reader = new BufferedReader(new FileReader("saves.txt"))) {
            String line;
            String[] strings = new String[2];
            line = reader.readLine();
            strings = line.split("::");
            user.setName(strings[0]);
            user.getStoryLine().setPreviousStoryCount(Integer.parseInt(strings[1]));
        } catch (FileNotFoundException e) {
            System.out.println("Сохранение не найдено");
        } catch (IOException e) {
            System.out.println("Ошибка чтения файла");
            ;
        }
        user.getStoryLine().setStoryCount(user.getStoryLine().getPreviousStoryCount());
        gameplay.loadStory(user.getStoryLine().getStoryCount());
    }

    public void printMenu() { // метод вывода меню при разных условиях
        if (!startGameFlag) {
            System.out.println();
            System.out.println("1. " + startTheGame);
            System.out.println("2. " + quitTheGame);
        } else {
            if (!saveGameFlag) {
                System.out.println();
                System.out.println("1. " + startTheGame);
                System.out.println("2. " + quitTheGame);
                System.out.println("3. " + returnToGame);
                System.out.println("4. " + saveTheGame);
            } else {
                System.out.println();
                System.out.println("1. " + startTheGame);
                System.out.println("2. " + quitTheGame);
                System.out.println("3. " + returnToGame);
                System.out.println("4. " + saveTheGame);
                System.out.println("5. " + loadTheGame);
            }
        }
        Scanner scanner = new Scanner(System.in);
        int answer = 0;
        try {
            answer = Integer.parseInt(scanner.nextLine());
        } catch (Exception e) {
            System.out.println("Некорректный ввод");
            printMenu();
        }

        // реакция на ввод юзера, в зависимости от состояния игры
        if (!startGameFlag) {
            switch (answer) {
                case 1 -> start();
                case 2 -> exit();
                default -> {
                    System.out.println("Некорректный ввод");
                    printMenu();
                }
            }
        } else {
            if (!saveGameFlag) {
                switch (answer) {
                    case 1 -> start();
                    case 2 -> exit();
                    case 3 -> resume();
                    case 4 -> save();
                    default -> {
                        System.out.println("Некорректный ввод");
                        printMenu();
                    }
                }
            } else {
                switch (answer) {
                    case 1 -> start();
                    case 2 -> exit();
                    case 3 -> resume();
                    case 4 -> save();
                    case 5 -> load();
                    default -> {
                        System.out.println("Некорректный ввод");
                        printMenu();
                    }
                }
            }
        }
    }

    public void exitToMenu() {
        printMenu();
    }
}
