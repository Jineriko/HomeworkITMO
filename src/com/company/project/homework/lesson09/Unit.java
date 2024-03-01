package com.company.project.homework.lesson09;

public abstract class Unit {
    private int heathPoint;
    private int maxHealthPoint;
    private int speed;
    private int money;


    public Unit(int heathPoint, int speed, int money) {
        if (heathPoint < 1) throw new IllegalArgumentException("Здоровье не может быть меньше 0");
        if (speed < 0) throw new IllegalArgumentException("Скорость не может быть отрицательной");
        if (money < 0) throw new IllegalArgumentException("Количество денег должно быть больше 0");
        this.heathPoint = heathPoint;
        maxHealthPoint = heathPoint;
        this.speed = speed;
        this.money = money;
    }

    public int getHeathPoint() {
        return heathPoint;
    }

    public void setHeathPoint(int heathPoint) {
        this.heathPoint = heathPoint;
    }

    public int getMaxHealthPoint() {
        return maxHealthPoint;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void rest(){
        if (heathPoint > 0 && heathPoint < maxHealthPoint)
            heathPoint++;
    }

    @Override
    public String toString() {
        return "Unit{" +
                "heathPoint=" + heathPoint +
                ", maxHealthPoint=" + maxHealthPoint +
                ", speed=" + speed +
                ", money=" + money +
                '}';
    }
}
