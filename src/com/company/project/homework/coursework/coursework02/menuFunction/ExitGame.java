package com.company.project.homework.coursework.coursework02.menuFunction;

public class ExitGame implements CommandMenu{
    private Menu exitMenu;

    public ExitGame(Menu exitMenu) {
        this.exitMenu = exitMenu;
    }

    @Override
    public void execute() {
        exitMenu.exit();
    }
}
