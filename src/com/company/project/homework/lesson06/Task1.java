package com.company.project.homework.lesson06;

public class Task1 {
    public static void main(String[] args) {
        /*
         * Дан массив целых чисел и целочисленная переменная (target).
         * Найти и вывести в консоль два элемента массива, которые в сумме дают target.
         * */
        int[] array = {5, 1, 8, 0, 4, 7, 10, 15};
        int target = 15;

        int indexExternal = 0;
        int indexInternal = 0;
        int number1;
        int number2;

        //Два цикла: внешний берет каждый элемент, начиная с начала массива,
        //внутренний - берет все последущие числа и проверят на сумму с target
        while (indexExternal < array.length) {
            number1 = array[indexExternal];
            indexInternal = indexExternal + 1;
            while (indexInternal < array.length) {
                if (array[indexInternal] == target - number1) {
                    number2 = array[indexInternal];
                    System.out.println("Первый элемент " + number1 + "\nВторой элемент " + number2);
                    System.out.println("---------------------");
                }
                indexInternal++;
            }
            indexExternal++;
        }
    }
}