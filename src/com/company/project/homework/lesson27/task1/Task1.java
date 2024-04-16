package com.company.project.homework.lesson27.task1;

import java.io.IOException;

public class Task1 {
    public static void main(String[] args) throws IOException, InterruptedException {
        /*
    Даны 4 файла с текстовой информацией.
    Строки в файлах имеют следующий вид: дата и время::приоритет::информация о событии
    Приоритет - целочисленное значение от 1 до 10, где 10 - наивысший приоритет.
    Вывести в консоль информацию о событиях с приоритетом 7 и выше.
    Вывести в консоль информацию о том, сколько сообщений с приоритетом 7 и выше находилось в файле.
    Каждый файл должен обрабатываться в отдельном потоке.
         */
        Reader reader01 = new Reader("file1.txt");
        Reader reader02 = new Reader("file2.txt");
        Reader reader03 = new Reader("file3.txt");
        Reader reader04 = new Reader("file4.txt");
        reader01.start();
//        reader01.join();
//        Thread.sleep(1000);
        reader02.start();
//        reader02.join();
//        Thread.sleep(1000);
        reader03.start();
//        reader03.join();
//        Thread.sleep(1000);
        reader04.start();
    }
}
