package com.company.project.homework.coursework.coursework02.menu;

public class ResumeGame implements Command {
    private Menu resumeGame;
    public ResumeGame(Menu resumeGame) {
        this.resumeGame = resumeGame;
    }
    @Override
    public void execute() {
        resumeGame.resume();
    }
}
