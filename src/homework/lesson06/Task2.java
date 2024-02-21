package homework.lesson06;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        /*
         * 2. Дан массив целых чисел. Изменить его таким образом,
         * чтобы вначале стояли только уникальные элементы (порядок следования элементов менять нельзя).
         * */
        int[] array = {5, 1, 8, 0, 4, 7, 10, 15, 5, 0, 7, 10};
        System.out.println("Массив до \n" + Arrays.toString(array));

        //Создание массива состоящего из 0
        int[] arrayZero = new int[array.length];
        int counter = 0;
        int element;
        int index = 0;

        //Если число в массиве array уникальное, то в цикле arrayZero его значение = 0, иначе значение не уникальное
        while (counter < array.length) {
            element = array[index];
            for (int i = index + 1; i < array.length; i++) {
                if (element == array[i])
                    arrayZero[index]++;
            }
            index++;
            counter++;
        }
//        System.out.println(Arrays.toString(arrayZero));

        //Создание массива, копии array, только вначале будут уникальные элементы
        int[] arrayResult = new int[array.length];
        int indexResult = 0;

        //Цикл, в котором все уникальные элементы, становятся на первые позиции нового массива
        for (int i = 0; i < arrayZero.length; i++) {
            if (arrayZero[i] == 0) {
                arrayResult[indexResult] = array[i];
                indexResult++;
            }
        }

        //Цикл, в котором остальные элементы становятся после уникальных элементов в новом массиве
        for (int i = 0; i < arrayZero.length; i++) {
            if (arrayZero[i] > 0) {
                arrayResult[indexResult] = array[i];
                indexResult++;
            }
        }
        array = arrayResult;
        System.out.println("Массив после \n" + Arrays.toString(array));
    }
}
