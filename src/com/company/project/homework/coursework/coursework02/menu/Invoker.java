package com.company.project.homework.coursework.coursework02.menu;

public class Invoker {
    private Command startGame;
    private Command resumeGame;
    private Command saveGame;
    private Command loadGame;
    private Command exitGame;
    private Command printMenu;
    private Command exitToMenu;

    public Invoker(Command startGame, Command resumeGame, Command saveGame, Command loadGame, Command exitGame, Command printMenu, Command exitToMenu) {
        this.startGame = startGame;
        this.resumeGame = resumeGame;
        this.saveGame = saveGame;
        this.loadGame = loadGame;
        this.exitGame = exitGame;
        this.printMenu = printMenu;
        this.exitToMenu = exitToMenu;
    }

    public void startGame() {
        startGame.execute();
    }

    public void resumeGame() {
        resumeGame.execute();
    }

    public void saveGame() {
        saveGame.execute();
    }

    public void loadGame() {
        loadGame.execute();
    }

    public void exitGame() {
        exitGame.execute();
    }

    public void printMenu() {
        printMenu.execute();
    }

    public void exitToMenu() {
        exitToMenu.execute();
    }
}
