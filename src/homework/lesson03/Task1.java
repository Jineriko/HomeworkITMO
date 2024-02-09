package homework.lesson03;

public class Task1 {
    public static void main(String[] args) {
        /*
        * Написать код, который будет проверять попало ли случайно сгенерированное целое число
        * из отрезка [10;500] в интервал (25;200) и выводить результат в консоль.
        * */
        int number = (int) (10 + Math.random() * 490);
        int begin = (int) (Math.random() + 25);
        int end = (int) (Math.random() + 200);


        String message = number > begin && number < end ? "Число попало в диапазон от 25 до 200" :
                "Число не попало в диапазон от 25 до 200";
        System.out.println("Сгенерированное число : " + number);
        System.out.println(message);
    }
}
