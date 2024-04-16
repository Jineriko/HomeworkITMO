package com.company.project.homework.coursework.coursework02.menu;

public class LoadGame implements Command {
    private Menu loadGame;
    public LoadGame(Menu loadGame) {
        this.loadGame = loadGame;
    }
    @Override
    public void execute() {
        loadGame.load();
    }
}
