package com.company.project.homework.lesson09;

public class Healer extends Unit implements healthRecovery{
    private int healthRestore;
    public Healer(int heathPoint, int speed, int money, int healthRestore) {
        super(heathPoint, speed, money);
        if (heathPoint < 0) throw new IllegalArgumentException("Количество восстанавливаемого здоровья" +
                "должно быть больше 0");
        this.healthRestore = healthRestore;
    }

    public int getHealthRestore() {
        return healthRestore;
    }

    @Override
    public void health(Unit unit) {
        unit.setHeathPoint(unit.getHeathPoint() + getHealthRestore());
    }
}
