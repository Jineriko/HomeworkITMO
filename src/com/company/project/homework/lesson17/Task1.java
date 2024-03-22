package com.company.project.homework.lesson17;

import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        /* Реализовать статический метод, который принимает `Collection<String> strings`
        и возвращает количество одинаковых слов в коллекции `strings` в виде `Map<String, Long>`.
        Где ключи - слова, а значения - количество повторений. */
        List<String> collection = new ArrayList<>();
        Collections.addAll(collection, "привет", "пока", "яблоко", "пока", "таблица", "пока", "яблоко");
        System.out.println(getNumberOfIdenticalWords(collection));
    }
    public static Map<String, Long> getNumberOfIdenticalWords(Collection<String> strings){
        if (strings == null) throw new IllegalArgumentException("Коллекция не может быть null");
        Map<String, Long> identicalWords = new HashMap<>();
        long countWords;
        for (String string : strings) {
            if (string == null) continue;
            countWords = Collections.frequency(strings, string);
            identicalWords.put(string, countWords);
        }
        return identicalWords;
    }
}