package com.company.project.homework.coursework.coursework02;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class GameApp {
    public static void main(String[] args) {
        System.out.println("Начало игры");
        /*
        0 Лисенок
        1 Вернуться домой
        2 Отправиться на поиски
        3 Попытаться разузнать о Бельчонке у лесных жителей
        4 Искать Бельчонка в одиночку
        5 Расспросить Сову
        6 Расспросить Волка
        7 Поверить Сове и отправиться вглубь леса
        8 Нужно воспользоваться шансом и раздобыть мёд
        9 Подождать, вдруг пчёлы улетят
        10 Нужно попытаться выкрасть мёд немедленно
        11 Поесть немного и передохнуть
        12 Скорее отнести мёд Медвежонку
        */
        Paragraph.getParagraphList().get(0).paragraphNameOutput();
        Paragraph.getParagraphList().get(0).paragraphTextOutput();
        Paragraph.getParagraphList().get(1).paragraphNameOutput();
        Paragraph.getParagraphList().get(2).paragraphNameOutput();

        Scanner scanner = new Scanner(System.in);
        int answerUser01 = scanner.nextInt();
        Action action = new Action();
        action.choiceAction(answerUser01);




    }
}
