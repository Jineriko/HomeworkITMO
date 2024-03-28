package com.company.project.homework.lesson05;

public class Task2 {
    public static void main(String[] args) {
        /*
        * Дан массив целых чисел: int[] task02 = {88, 34, 12, 55, 90, 4, 10, 44}.
        * Найти максимальную сумму четырёх смежных целых чисел в массиве task02.
        * Использовать алгоритм скользящего окна.
        * */
        int[] task02 = {88, 34, 12, 55, 90, 4, 10, 44};
        int maxSum = 0;

        for (int i = 3; i < task02.length; i++) {
            int tempSum = task02[i - 3] + task02 [i - 2] + task02 [i - 1] + task02 [i];

            if (tempSum > maxSum)
                maxSum = tempSum;
        }
        System.out.println("Максимальная сумма четырёх смежных чисел = " + maxSum);
    }
}
