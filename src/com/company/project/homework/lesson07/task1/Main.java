package com.company.project.homework.lesson07.task1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /*
        Задача 1. Описать объектную модель Альпинист, Гора, Группа для восхождения на гору.

        Альпинист создаётся с именем (не менее 3 символов) и адресом проживания (не менее 5 символов).
        Гора создаётся с названием (не менее 4 символов), страной (не менее 4 символов) и высотой (не менее 100 метров)
        Группа для восхождения на гору создаётся со следующими характеристиками и возможностями:
        - идёт набор в группу или нет;
        - массив альпинистов;
        - гора;
        - должна быть возможность добавить альпиниста в группу (в массив), если набор ещё идёт
        В методе main (отдельного класса) создать:
        - 3 группы для восхождений на 3 различных горы.
        - В первой группе 3 альпиниста (набор закрыт)
        - Во второй и третьей группах по 2 альпиниста (набор в эти группы открыт)

        При выполнении задания необходимо обращать внимание на модификаторы доступа и выполнять все необходимые проверки.
        */
        Climber climber1 = new Climber("Алексей", "Санкт-Петербург");
        Climber climber2 = new Climber("Екатерина", "Санкт-Петербург");
        Climber climber3 = new Climber("Дарья", "Москва");
        Climber climber4 = new Climber("Иван", "Киров");
        Climber climber5 = new Climber("Заур", "Пятигорск");
        Climber climber6 = new Climber("Елена", "Киров");
        Climber climber7 = new Climber("Юрий", "Санкт-Петербург");
        Climber climber8 = new Climber("Анастасия", "Санкт-Петербург");
        Climber climber9 = new Climber("Петр", "Екатеринбург");

        Mountain mountain1 = new Mountain("Эверест", "Россия", 8849);
        Mountain mountain2 = new Mountain("Анды", "Южная америка", 6961);
        Mountain mountain3 = new Mountain("Килиманджаро", "Африка", 5895);

        ClimbingGroup climbingGroup1 = new ClimbingGroup(mountain1);
        ClimbingGroup.addClimbingGroup(climber1, climbingGroup1);
        ClimbingGroup.addClimbingGroup(climber2, climbingGroup1);
        ClimbingGroup.addClimbingGroup(climber3, climbingGroup1);
        ClimbingGroup.addClimbingGroup(climber4, climbingGroup1);

        ClimbingGroup climbingGroup2 = new ClimbingGroup(mountain2);
        ClimbingGroup.addClimbingGroup(climber5, climbingGroup2);
        ClimbingGroup.addClimbingGroup(climber6, climbingGroup2);

        ClimbingGroup climbingGroup3 = new ClimbingGroup(mountain3);
        ClimbingGroup.addClimbingGroup(climber8, climbingGroup3);
        ClimbingGroup.addClimbingGroup(climber9, climbingGroup3);


        System.out.println(Arrays.toString(climbingGroup1.getClimbers()));
        System.out.println(Arrays.toString(climbingGroup2.getClimbers()));
        System.out.println(Arrays.toString(climbingGroup3.getClimbers()));
    }
}
