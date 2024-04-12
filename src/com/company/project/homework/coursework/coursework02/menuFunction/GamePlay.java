package com.company.project.homework.coursework.coursework02.menuFunction;

public class GamePlay {
    private CommandMenu startGame;
    private CommandMenu resumeGame;
    private CommandMenu saveGame;
    private CommandMenu loadGame;
    private CommandMenu exitGame;

    public GamePlay(CommandMenu startGame, CommandMenu resumeGame, CommandMenu saveGame, CommandMenu loadGame, CommandMenu exitGame) {
        this.startGame = startGame;
        this.resumeGame = resumeGame;
        this.saveGame = saveGame;
        this.loadGame = loadGame;
        this.exitGame = exitGame;
    }

    public void startGame(){
        startGame.execute();
    }
    public void resumeGame(){
        resumeGame.execute();
    }
    public void saveGame(){
        saveGame.execute();
    }
    public void loadGame(){
        loadGame.execute();
    }
    public void exitGame(){
        exitGame.execute();
    }
}
