package com.company.project.homework.coursework.coursework02.menuFunction;

public class StartGame implements CommandMenu{
    private Menu startGame;

    public StartGame(Menu startGame) {
        this.startGame = startGame;
    }

    @Override
    public void execute() {
        startGame.start();
    }
}
