package com.company.project.homework.lesson05;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        /*
         * Отсортировать массив пузырьковой сортировкой
         * */
        int[] array = {-4, 55, 924, -41, 0, -100, 58};
        System.out.println("Массив до сортировки \n" + Arrays.toString(array));
        boolean isSorted = false;

        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < array.length; i++) {
                int temp;
                if (array[i - 1] > array[i]) {
                    temp = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = temp;
                    isSorted = false;
                }
            }
        }
        System.out.println("Массив после сортировки \n" + Arrays.toString(array));
    }
}
