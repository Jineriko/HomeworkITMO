package com.company.project.homework.lesson09;

public class Knight extends BattleUnit implements Attackable{
    private Knight(int heathPoint, int speed, int money, int attackPower) {
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

    public static Attackable initBattleUnit(int value){
        return new Knight(200, 10 * value, 100 * value, (int)((Math.random() + 1) * value));
    }
    public static Attackable[] initBattleUnitArray(int countValue){
        if (countValue <= 0 || countValue > 20) throw new IllegalArgumentException("Количество человек в армии не может превышать 20 человек");
        BattleUnit[] battleUnits = new BattleUnit[countValue];
        for (int i = 0; i < countValue; i++){
            battleUnits[i] = new Knight(200, 10 * countValue, 100 * countValue, (int)((Math.random() + 1) * countValue));
        }
        return battleUnits;
    }

}
