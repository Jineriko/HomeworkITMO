package com.company.project.homework.lesson09;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        King king1 = new King(1000, 20);
        King king2 = new King(1200, 15);

//        Infantryman infantryman1 = new Infantryman(100, 40, 100, (int) ((Math.random() * 15)) + 1);
//        Infantryman infantryman2 = new Infantryman(100, 40, 100, (int) ((Math.random() * 15)) + 1);
//        Infantryman infantryman3 = new Infantryman(100, 40, 100, (int) ((Math.random() * 15)) + 1);
//        Infantryman infantryman4 = new Infantryman(100, 40, 100, (int) ((Math.random() * 15)) + 1);
//        Infantryman infantryman5 = new Infantryman(100, 40, 100, (int) ((Math.random() * 15)) + 1);
//        Infantryman infantryman6 = new Infantryman(100, 40, 100, (int) ((Math.random() * 15)) + 1);
//        Infantryman infantryman7 = new Infantryman(100, 40, 100, (int) ((Math.random() * 15)) + 1);
//        Infantryman infantryman8 = new Infantryman(100, 40, 100, (int) ((Math.random() * 15)) + 1);
//
//        Knight knight1 = new Knight(200, 20, 200, (int) ((Math.random() * 40)) + 1);
//        Knight knight2 = new Knight(200, 20, 200, (int) ((Math.random() * 40)) + 1);
//        Knight knight3 = new Knight(200, 20, 200, (int) ((Math.random() * 40)) + 1);
//        Knight knight4 = new Knight(200, 20, 200, (int) ((Math.random() * 40)) + 1);
//        Knight knight5 = new Knight(200, 20, 200, (int) ((Math.random() * 40)) + 1);
//        Knight knight6 = new Knight(200, 20, 200, (int) ((Math.random() * 40)) + 1);
//        Knight knight7 = new Knight(200, 20, 200, (int) ((Math.random() * 40)) + 1);
//        Knight knight8 = new Knight(200, 20, 200, (int) ((Math.random() * 40)) + 1);
//        Knight knight9 = new Knight(200, 20, 200, (int) ((Math.random() * 40)) + 1);
//        Knight knight10 = new Knight(200, 20, 200, (int) ((Math.random() * 40)) + 1);
//        Knight knight11 = new Knight(200, 20, 200, (int) ((Math.random() * 40)) + 1);
//        Knight knight12 = new Knight(200, 20, 200, (int) ((Math.random() * 40)) + 1);

//        BattleUnit[] battleUnitsArmyOfInfantryman = {infantryman1, infantryman2, infantryman3, infantryman4,
//                infantryman5, infantryman6, infantryman7, infantryman8, knight1, knight2};
//        BattleUnit[] battleUnitsArmyOfKnight = {knight3, knight4, knight5, knight6, knight7, knight8,
//                knight9, knight10, knight11, knight12};

//        king1.armyRecruitment(battleUnitsArmyOfInfantryman);
//        king2.armyRecruitment(battleUnitsArmyOfKnight);

        Attackable[] knights = Knight.initBattleUnitArray(18);
        Attackable[] infantryman = Infantryman.initBattleUnitArray(10);
        System.out.println(Arrays.toString(knights));
        System.out.println(Arrays.toString(infantryman));
        System.out.println();

        king1.armyRecruitment((BattleUnit[]) knights);
        king2.armyRecruitment((BattleUnit[]) infantryman);

        Thread.sleep(5000);
        King.kingsAttack(king1, king2);
        System.out.println(Arrays.toString(knights));
        System.out.println(Arrays.toString(infantryman));
    }
}
