package com.company.project.homework.lesson09;

public abstract class BattleUnit extends Unit {
    private int attackPower;
    public BattleUnit(int heathPoint, int speed, int money, int attackPower) {
        super(heathPoint, speed, money);
        if (attackPower < 0) throw new IllegalArgumentException("Сила атаки должна быть больше 0");
        this.attackPower = attackPower;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public abstract void attack(BattleUnit unit);

    @Override
    public void rest(){
        if (getHeathPoint() > 0 && getHeathPoint() < getMaxHealthPoint() - 1)
            setHeathPoint(getHeathPoint() + 2);
    }
}
