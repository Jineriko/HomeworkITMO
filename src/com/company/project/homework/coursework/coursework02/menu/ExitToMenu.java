package com.company.project.homework.coursework.coursework02.menu;

public class ExitToMenu implements Command{
    private Menu exitToMenu;

    public ExitToMenu(Menu exitToMenu) {
        this.exitToMenu = exitToMenu;
    }

    @Override
    public void execute() {
        exitToMenu.exitToMenu();
    }
}
