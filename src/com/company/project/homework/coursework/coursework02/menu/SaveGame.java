package com.company.project.homework.coursework.coursework02.menu;

public class SaveGame implements Command {
    private Menu saveGame;
    public SaveGame(Menu saveGame) {
        this.saveGame = saveGame;
    }
    @Override
    public void execute() {
        saveGame.save();
    }
}
