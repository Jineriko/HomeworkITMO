package lesson02;

public class Lesson02Homework {
    public static void main(String[] args) {
        /*
        * 1. Объявите переменные для хранения информации об общем количестве писем и о количестве отправленных писем.
        *    Присвойте значения этим переменным. Выведите в консоль, сколько писем осталось отправить
        * */
        int totalNumberOfLetters = 100;
        int numberOfSentLetters = 88;
        System.out.println(totalNumberOfLetters - numberOfSentLetters);

        /*
        * 2. Объявить и инициализировать переменные для хранения времени (в часах) и расстояния (в километрах).
        *    Найти и вывести в консоль скорость, выраженную в метрах в секунду.
        * */
        int time = 50;
        int distance = 70;
        double speed = (double) distance / time * 1000 / 3600; //перевод скорости в м/с
        System.out.println(speed);

        /*
        * 3. Найти сумму цифр целого положительного двузначного числа. Результат вывести в консоль.
        * */
        int number = 92;
        int sum = (number % 10) + (number / 10);
        System.out.println(sum);

        /*
        * 4. Поменять значения 2х переменных местами, используя арифметические операторы. Результат вывести в консоль.
        * */
        int variable1 = 57;
        int variable2 = 13;
        int temp = variable1;
        variable1 = variable2;
        variable2 = temp;
        System.out.println(variable1 + " " + variable2);

        /*
        * 5. Разобрать, как работает оператор остаток от деления '%'
        * */
        //Этот оператор возвращает остаток от деления первого операнда на второй
        //Например выражение "5 / 2" - целая часть 2, остаток от деления 1, т.е "5 % 2" == 1

        /*
        * 6. Ответить на вопросы:
        *   6.1 Какой тип у doubleResult01 и почему?
        *   6.2 Чему равно значение doubleResult01 и почему?
        *   int num01 = 3; int num02 = 2; int result = num01 / num02; var doubleResult01 = (double) (num01 / num02);
        * */
        //6.1 тип == double, т.к. используется явное приведение к типу double
        //6.2 doubleResult01 == 1.0, т.к. сначала происходит деление интеджеров, которое в результате дает 1,
        //    затем интеджер приводится к типу дабл
    }
}
