package com.company.project.homework.lesson03;

public class Task2 {
    public static void main(String[] args) {
        /*
        * Даны переменные x и y - координаты точки на плоскости.
        *
        * Необходимо определить четверть координатной плоскости, которой принадлежит данная точка.
        * Результат вывести в консоль.
        *
        * Если обе координаты положительны, точка принадлежит первой четверти.
        * Если координата x отрицательна, а y положительна, точка принадлежит второй четверти.
        * Если обе координаты отрицательны, точка принадлежит третьей четверти.
        * Если координата x положительна, а y отрицательна, точка принадлежит четвёртой четверти.
        * */
        int coordinateX = (int) (Math.random() * (200+1)) - 100;
        int coordinateY = (int) (Math.random() * (200+1)) - 100;

        System.out.println("Координата X = " + coordinateX);
        System.out.println("Координата Y = " + coordinateY);

        String message = coordinateX > 0 && coordinateY > 0 ? "Точка принадлежит первой четверти" :
                coordinateX < 0 && coordinateY > 0 ? "Точка принадлежит второй четверти" :
                        coordinateX < 0 && coordinateY < 0 ? "Точка принадлежит третьей четверти" :
                                coordinateX > 0 && coordinateY < 0 ? "Точка принадлежит четвертой четверти" :
                                        "Одна из координат = 0, точка лежит на одной из осей";
        System.out.println(message);

    }
}
