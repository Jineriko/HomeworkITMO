package com.company.project.homework.coursework.coursework02.menu;

public class ExitGame implements Command {
    private Menu exitMenu;

    public ExitGame(Menu exitMenu) {
        this.exitMenu = exitMenu;
    }

    @Override
    public void execute() {
        exitMenu.exit();
    }
}
