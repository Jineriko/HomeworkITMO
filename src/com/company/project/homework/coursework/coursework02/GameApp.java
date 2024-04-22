package com.company.project.homework.coursework.coursework02;

import com.company.project.homework.coursework.coursework02.gamePlay.Gameplay;

public class GameApp {
    public static void main(String[] args) {
        System.out.println("Начало игры");
        System.out.println();
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
        User user01 = new User("Alex");
        Gameplay gameplay = new Gameplay(user01);


        while (user01.getStoryLine().getStoryCount() != 0){
            gameplay.actionUser();
        }
    }
}
