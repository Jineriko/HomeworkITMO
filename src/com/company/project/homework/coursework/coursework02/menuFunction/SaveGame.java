package com.company.project.homework.coursework.coursework02.menuFunction;

public class SaveGame implements CommandMenu{
    private Menu saveGame;

    public SaveGame(Menu saveGame) {
        this.saveGame = saveGame;
    }

    @Override
    public void execute() {
        saveGame.save();
    }
}
