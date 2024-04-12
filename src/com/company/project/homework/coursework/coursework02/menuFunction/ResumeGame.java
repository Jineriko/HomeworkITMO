package com.company.project.homework.coursework.coursework02.menuFunction;

public class ResumeGame implements CommandMenu{
    private Menu resumeGame;

    public ResumeGame(Menu resumeGame) {
        this.resumeGame = resumeGame;
    }

    @Override
    public void execute() {
        resumeGame.resume();
    }
}
