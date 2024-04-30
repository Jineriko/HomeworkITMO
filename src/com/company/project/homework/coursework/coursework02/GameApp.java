package com.company.project.homework.coursework.coursework02;

import com.company.project.homework.coursework.coursework02.menu.*;

public class GameApp {
    public static void main(String[] args) {
        Menu menu = new Menu();
        Command start = new StartGame(menu);
        Command exit = new ExitGame(menu);
        Command save = new SaveGame(menu);
        Command load = new LoadGame(menu);
        Command resume = new ResumeGame(menu);
        Command printMenu = new PrintMenu(menu);
        Command exitToMenu = new ExitToMenu(menu);
        Invoker invoker = new Invoker(start, resume, save, load, exit, printMenu, exitToMenu);

        invoker.printMenu();
        invoker.startGame();
    }
}
