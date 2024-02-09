package homework.lesson03;

public class Task4 {
    public static void main(String[] args) {
        /*
        * Даны переменные couponNumber - номер купона и resultSum - сумма покупки.
        *
        * Если номер купона - 1111, 4444 или 9999 - скидка 10%,
        * Если номер купона - 3333 или 7777 - скидка 20%,
        * Если номер купона - 5555 - скидка 30%.
        * В остальных случаях скидка не предусмотрена.
        *
        * Необходимо вычислить и сохранить в переменную resultSum сумму с учетом скидки,
        * если она предусмотрена. Вывести значение resultSum в консоль.
        */
        int[] couponNumber = {1111, 2222, 3333, 4444, 5555, 6666, 7777, 8888, 9999};
        // Все возможные номера купонов
        double resultSum = 2000;

        switch (couponNumber[(int) (Math.random() * 9)]){
            case 1111, 4444, 9999 -> {
                System.out.println("Скидка 10%");
                resultSum = resultSum * 0.9;
            }
            case 3333, 7777 -> {
                System.out.println("Скидка 20%");
                resultSum = resultSum * 0.8;
            }
            case 5555 -> {
                System.out.println("Скидка 30%");
                resultSum = resultSum * 0.7;
            }
            default -> System.out.println("Скидка не предусмотрена");
        }
        System.out.println("Сумма покупки с учетом скидки: " + resultSum);
    }
}
