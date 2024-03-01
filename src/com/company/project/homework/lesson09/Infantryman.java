package com.company.project.homework.lesson09;

public class Infantryman extends BattleUnit{
    public Infantryman(int heathPoint, int speed, int money, int attackPower) {
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
}
