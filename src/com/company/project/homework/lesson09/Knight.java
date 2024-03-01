package com.company.project.homework.lesson09;

public class Knight extends BattleUnit {
    public Knight(int heathPoint, int speed, int money, int attackPower) {
        super(heathPoint, speed, money, attackPower);
    }

    @Override
    public void attack(BattleUnit unit) {
        if (unit == null) return;
        if (this.getHeathPoint() > 1) {
            unit.setHeathPoint(unit.getHeathPoint() - this.getAttackPower());
            System.out.println("Рыцарь " + this + " атакует " + unit);
        } else {
            System.out.println("Слишком мало здоровья, рыцарь не может атаковать");
        }
        if (unit instanceof BattleUnit) {
            this.setHeathPoint(this.getHeathPoint() - unit.getAttackPower());
            System.out.println("Рыцарь " + this + " получает атаку в ответ от " + unit);
        }
    }

}
