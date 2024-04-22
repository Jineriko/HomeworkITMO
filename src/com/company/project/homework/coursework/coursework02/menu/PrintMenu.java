package com.company.project.homework.coursework.coursework02.menu;

public class PrintMenu implements Command{
    private Menu printMenu;
    public PrintMenu(Menu printMenu) {
        this.printMenu = printMenu;
    }

    @Override
    public void execute() {
        printMenu.printMenu();
    }
}
