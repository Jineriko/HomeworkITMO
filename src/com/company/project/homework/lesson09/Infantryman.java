package com.company.project.homework.lesson09;

public class Infantryman extends BattleUnit implements Attackable{
    private Infantryman(int heathPoint, int speed, int money, int attackPower) {
        super(heathPoint, speed, money, attackPower);

    }


    @Override
    public void attack(BattleUnit unit) {
        if (unit == null) return;
        if (this.getHeathPoint() > 1){
            unit.setHeathPoint(unit.getHeathPoint() - this.getAttackPower());
            System.out.println("Пехотинец " + this + " атакует " + unit);
        } else {
            System.out.println("Слишком мало здоровья, пехотинец не может атаковать");
        }
        if (unit.getHeathPoint() < 5){
            unit.setHeathPoint(unit.getHeathPoint() - this.getAttackPower());
            System.out.println("Пехотинец " + this + " атакует " + unit);
        }
    }

    public static Attackable initBattleUnit(int value){
        return new Infantryman(200, 10 * value, 100 * value, (int)((Math.random() + 1) * value));
    }
    public static Attackable[] initBattleUnitArray(int countValue){
        if (countValue <= 0 || countValue > 20) throw new IllegalArgumentException("Количество человек в армии не может превышать 20 человек");
        BattleUnit[] battleUnits = new BattleUnit[countValue];
        for (int i = 0; i < countValue; i++){
            battleUnits[i] = new Infantryman(200, 10 * countValue, 100 * countValue, (int)((Math.random() + 1) * countValue));
        }
        return battleUnits;
    }

}
