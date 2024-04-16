package com.company.project.homework.coursework.coursework02.gamePlay;

public class Gameplay {
    private User user;
    public Gameplay(User user) {
        this.user = user;
    }
    public void startStory(){
        user.getStoryLine().startStory();
    }
    public void actionUser(){
        user.answerUser();
        int progressStory = user.getStoryLine().getStoryCount();
        this.nextStory(progressStory);
    }
    private void nextStory(int value){
        switch (value){
            case 2 ->  user.getStoryLine().paragraph02_2(); // Вернуться домой
            case 3 ->  user.getStoryLine().paragraph02_1(); // Отправиться на поиски
            case 4 ->  user.getStoryLine().paragraph03_1(); // Попытаться разузнать о Бельчонке у лесных жителей
            case 5 ->  user.getStoryLine().paragraph03_2(); // Искать Бельчонка в одиночку
            case 11 -> user.getStoryLine().paragraph04_1(); // Расспросить Сову
            case 12 -> user.getStoryLine().paragraph04_2(); // Расспросить Волка
            case 21 -> user.getStoryLine().paragraph05_1(); // Поверить Сове и отправиться вглубь леса
            case 22 -> user.getStoryLine().paragraph03_2(); // Искать Бельчонка в одиночку
            case 31 -> user.getStoryLine().paragraph03_2(); // Искать Бельчонка в одиночку
            case 32 -> user.getStoryLine().paragraph02_2(); // Вернуться домой
            case 41 -> user.getStoryLine().paragraph03_2(); // Искать Бельчонка в одиночку
            case 42 -> user.getStoryLine().paragraph06_1(); // Нужно воспользоваться шансом и раздобыть мёд
            case 43 -> user.getStoryLine().paragraph07_2(); // Подождать, вдруг пчёлы улетят
            case 44 -> user.getStoryLine().paragraph07_1(); // Нужно попытаться выкрасть мёд немедленно
            case 51 -> user.getStoryLine().paragraph08_1(); // Поесть немного и передохнуть
            case 52 -> user.getStoryLine().paragraph08_2(); // Скорее отнести мёд Медвежонку
            case 53 -> user.getStoryLine().paragraph02_2(); // Вернуться домой
        }
    }
}
