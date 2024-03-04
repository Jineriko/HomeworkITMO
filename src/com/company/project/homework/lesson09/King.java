package com.company.project.homework.lesson09;

public class King extends Unit {
    private BattleUnit[] army;
    private int index = 0;
    public static final int maxUnitCount = 20;


    public King(int heathPoint, int speed) {
        super(heathPoint, speed, 500);
        army = new BattleUnit[maxUnitCount];
    }

    //Метод набора в армию
    public void armyRecruitment(BattleUnit[] units) {
        if (getMoney() < 200) {
            System.out.println("Недостаточно средств, чтобы нанять армию юнитов");
            return;
        }
        if (army[army.length - 1] != null) {
            System.out.println("В армии нет свободных мест");
            return;
        }
        if (units.length > 20) {
            System.out.println("В армии короля не может быть больше 20 юнитов");
            return;
        }
        int unitsCount = 0;
        while (unitsCount < units.length){
            if (army[index] == null) {
                army[index] = units[unitsCount];
                index++;
                unitsCount++;
            }
            if (index == 19){
                System.out.println("Набор в армию завершен");
                break;
            }
        }
        setMoney(getMoney() - 200);
    }

    //Метод замены юнита
    public void replaceUnit(BattleUnit unit){
        if (getMoney() < 12) {
            System.out.println("Недостаточно средств, чтобы воспользоваться заменой юнита");
            return;
        }
        boolean flag = false;
        for (int i = 0; i < army.length; i++){
            if (army[i].getHeathPoint() < 1){
                Unit tempUnit = army[i];
                army[i] = unit;
                flag = true;
                System.out.println("В армии заменили юнита " + tempUnit + " на " + army[i]);
                break;
            }
        }
        if (!flag) System.out.println("Все юниты в армии здоровы");
        setMoney(getMoney() - 12);
    }

    public BattleUnit[] mobilization(){
        return army;
    }
    public static void kingsAttack(King king1, King king2){
        for (int indexKing1 = 0; indexKing1 < king1.mobilization().length; indexKing1++){
            for (int indexKing2 = 0; indexKing2 < king2.mobilization().length; indexKing2++){
                if (king1.mobilization()[indexKing1] == null || king2.mobilization()[indexKing2] == null)
                    continue;
                king1.mobilization()[indexKing1].attack(king2.mobilization()[indexKing2]);
                if (king2.mobilization()[indexKing2].getHeathPoint() < 1)
                    king2.mobilization()[indexKing2] = null;
                if (king1.mobilization()[indexKing1].getHeathPoint() < 1)
                    king1.mobilization()[indexKing1] = null;
            }
        }

        int countSoldiersKing1 = 0;
        int countSoldiersKing2 = 0;

        for (BattleUnit battleUnit : king1.mobilization())
            if (battleUnit != null)
                countSoldiersKing1++;
        for (BattleUnit battleUnit : king2.mobilization())
            if (battleUnit != null)
                countSoldiersKing2++;
        if (countSoldiersKing1 == countSoldiersKing2){
            System.out.println("Ничья");
            return;
        }
        if (countSoldiersKing1 > countSoldiersKing2){
            System.out.println("Победил первый король");
            king1.setMoney(king2.getMoney() / 2);
            king2.setMoney(king2.getMoney() / 2);
        } else {
            System.out.println("Победил второй король");
            king2.setMoney(king1.getMoney() / 2);
            king1.setMoney(king1.getMoney() / 2);
        }
    }

    @Override
    public void rest() {
        if (getHeathPoint() > 0 && getHeathPoint() < getMaxHealthPoint() - 4 && getMoney() > 2)
            setHeathPoint(getHeathPoint() + 5);
    }
}
