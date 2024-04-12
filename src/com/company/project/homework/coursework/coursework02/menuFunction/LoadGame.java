package com.company.project.homework.coursework.coursework02.menuFunction;

public class LoadGame implements CommandMenu{
    private Menu loadGame;

    public LoadGame(Menu loadGame) {
        this.loadGame = loadGame;
    }

    @Override
    public void execute() {
        loadGame.load();
    }
}
