package homework.lesson04;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        /*
        * 1. Пользователь загадывает число в диапазоне от [1 до 100].
        * 2. Пользователь загадывает в уме, программа не хранит это
            число, а пытается его угадать.
        * 3. Программа пытается его угадать (вместо обычного перебора постарайтесь
            использовать метод бинарного поиска, т.е деление отрезка на 2, пока число не будет найдено).
        * 4. Программа может задавать пользователю вопросы: Число равно ...?, Число больше ...?
            и, в зависимости от ответа пользователя, принимать решения.
        * 5. Вместо текстовых ответов ДА/НЕТ, используйте числа 0 - НЕТ и 1 - ДА
        *
        * Для вывода текста и значения переменной используйте оператор сложения,
        * например "System.out.println("Число равно " + number);"
        * */
        int startNumber = 1;
        int endNumber = 100;
        int average = 0;
        int userAnswer;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Загадайте число в диапазаоне от 1 до 100 включительно");

        //Алгоритм поиска числа из промежутка, с помощью бинарного поиска
        //Сужает диапазон до тех пор, пока не останется 2 числа и выходит из цикла
        while (true) {
            if (endNumber - startNumber == 1) {
                break;
            }
            average = (startNumber + endNumber) / 2;
            System.out.println("Ваше число больше " + average + "?");
            userAnswer = scanner.nextInt();
            if (userAnswer == 1) {
                startNumber = average;
                continue;
            }
            if (userAnswer == 0) {
                endNumber = average;
                continue;
            }
        }

        //Почти во всех случаях, загаданное число будет равно большему числу из оставшихся,
        //кроме случая, когда загаданно число '1' или '2'
        //для них прописал отдельное условие.
        //Для всех остальных чисел работает последний else
        if (startNumber == 1) {
            System.out.println("Ваше число больше " + startNumber + "?");
            userAnswer = scanner.nextInt();
            if (userAnswer == 1)
                System.out.println("Загаданное число " + endNumber);
            else
                System.out.println("Загаданное число " + startNumber);
        } else {
            System.out.println("Загаданное число " + endNumber);
        }

    }
}
