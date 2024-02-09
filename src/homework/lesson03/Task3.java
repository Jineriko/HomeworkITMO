package homework.lesson03;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        /*
         * Дана переменная monthNumber, которая хранит порядковый номера месяца.
         * И переменная isLeap, которая хранит информацию о том, является ли год високосным.
         *
         * Написать программу, которая в зависимости от значения monthNumber выводит в консоль
         * количество дней в этом месяце.
         * Необходимо рассмотреть два случая: год не является високосным и год является високосным.
         * */
        int monthNumber = (int) (Math.random() * 13);
        Random random = new Random();
        boolean isLeap = random.nextBoolean();

        if (isLeap) {
            int countDayOfMonth = switch (monthNumber) {
                case 1, 3, 5, 7, 8, 10, 12 -> 31;
                case 4, 6, 9, 11 -> 30;
                case 2 -> 29;
                default -> 0;
            };
            System.out.println("В високосный год, в месяце под номером " + monthNumber +
                    " - " + countDayOfMonth + " дней");
        } else {
            int countDayOfMonth = switch (monthNumber) {
                case 1, 3, 5, 7, 8, 10, 12 -> 31;
                case 4, 6, 9, 11 -> 30;
                case 2 -> 28;
                default -> 0;
            };
            System.out.println("В невисокосный год, в месяце под номером " + monthNumber +
                    " - " + countDayOfMonth + " дней");
        }
    }
}
