package com.company.project.homework.coursework.coursework02.menu;

import com.company.project.homework.coursework.coursework02.User;
import com.company.project.homework.coursework.coursework02.gamePlay.Gameplay;

import java.io.*;
import java.util.Scanner;

//Reciver
public class Menu {
    private boolean saveGameFlag = false; // флаг для проверки сохранения
    private boolean startGameFlag = false; // флаг для проверки первого захода в меню

    public void start(){ // создает нового юзера и запускает первый параграф
        System.out.println("Введите имя игрока");
        Scanner scanner = new Scanner(System.in);
        User user = new User(scanner.nextLine());
        Gameplay gameplay = new Gameplay(user);
        gameplay.startStory();
        startGameFlag = true;
    }
    public void exit(){}
    public void resume(){}
    public void save(User user, String filename){
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))){
            writer.write(user.getName());
            writer.write("::");
            writer.write(user.getStoryLine().getStoryCount());
        } catch (IOException e) {
            System.out.println("Ошибка при сохранении");;
        }
    }
    public void load(User user ,String filename){
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            String[] strings = new String[2];
            line = reader.readLine();
            strings = line.split("::");
            user.setName(strings[0]);
            user.getStoryLine().setStoryCount(Integer.parseInt(strings[1]));
        } catch (FileNotFoundException e) {
            System.out.println("Сохранение не найдено");
        } catch (IOException e) {
            System.out.println("Ошибка чтения файла");;
        }
    }
    public void printMenu(){ // метод вывода меню при разных условиях
        if (!saveGameFlag){
            System.out.println("1. Начать игру");
            System.out.println("2. Выйти из игры");
        } else {
            if (!saveGameFlag){
                System.out.println("1. Начать игру");
                System.out.println("2. Вернуться к игре");
                System.out.println("3. Выйти из игры");
                System.out.println("4. Сохранить игру");
            } else {
                System.out.println("1. Начать игру");
                System.out.println("2. Вернуться к игре");
                System.out.println("3. Выйти из игры");
                System.out.println("4. Сохранить игру");
                System.out.println("5. Загрузить игру");
            }
        }
    }
}
