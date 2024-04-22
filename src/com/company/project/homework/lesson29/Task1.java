package com.company.project.homework.lesson29;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Task1 {
    public static void main(String[] args) {
        /*
        Реализовать многопоточный подсчет ТОП-10 слов.
        Тест хранится в файле.
        Main поток читает текст из файла и объединяет результаты работы вспомогательных потоков.
        Вспомогательные потоки обрабатывают информацию, прочитанную main потоком.
        Вспомогательные потоки создаются по количеству доступных ядер процессора:
        int numberOfThreads = Runtime.getRuntime().availableProcessors();
        */
        String filename = "randomText.txt";
        int numberOfThreads = Runtime.getRuntime().availableProcessors();
        StringBuilder sb = new StringBuilder();

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null){
                sb.append(line + "\n");
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
            throw new RuntimeException(e);
        } catch (IOException e) {
            System.out.println("Ошибка чтения из файла");
            throw new RuntimeException(e);
        }

        List<StringBuilder> stringBuilderList = stringBuilderList(sb); // метод,
        // который разбивает стрингбилдер на лист стрингбилдеров, в котором примерно по 100 символов

        ThreadData td = new ThreadData(stringBuilderList);
        td.start();
        try {
            td.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        Map<String, Long> frequency = td.getAllWords().stream() // сбор данных из list в map
                .collect(Collectors.groupingBy(
                        Function.identity(), Collectors.counting()));

        var finishData = frequency.entrySet()  // хранилище 10 самых популярных слов
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(10)
                .collect(Collectors.toList());
        System.out.println(finishData);
    }
    public static List<StringBuilder> stringBuilderList (StringBuilder sb){
        List<StringBuilder> stringBuilderList = new ArrayList<>();
        int startIndex = 0;
        int endIndex = 0;
        while (true){
            endIndex = sb.indexOf(" ", 100);
            if (endIndex == -1){
                stringBuilderList.add(sb);
                break;
            }
            stringBuilderList.add(new StringBuilder(sb.substring(startIndex, endIndex)));
            sb.delete(startIndex, endIndex);
        }
        return stringBuilderList;
    }
}
