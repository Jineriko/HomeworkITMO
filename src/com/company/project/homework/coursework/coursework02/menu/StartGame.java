package com.company.project.homework.coursework.coursework02.menu;

public class StartGame implements Command {
    private Menu startGame;

    public StartGame(Menu startGame) {
        this.startGame = startGame;
    }

    @Override
    public void execute() {
        startGame.start();
    }
}
