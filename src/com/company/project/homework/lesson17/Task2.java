package com.company.project.homework.lesson17;

import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        /* Реализовать статический метод, принимающий на вход `String word` и `String text`
        и возвращающий частоту встречаемости слова `word` в тексте `text` в виде `Map<String, Long>`.
        Где ключ - слово, а значение - частота встречаемости */
        String text = "It is a uncover long established fact that a reader will be distracted uncover by the readable content of a page " +
                "when looking at its layout The point of using uncover Lorem Ipsum is that sites it has a more-or-less normal distribution of letters" +
                "as uncover opposed to still using Content here humour uncover content here making it look like readable English Many desktop publishing " +
                "packages and web page editors now use Lorem Ipsum as their default model text and a search for lorem ipsum will " +
                "uncover many web sites still uncover in their infancy Various versions uncover have evolved over the years uncover sometimes by accident" +
                " sometimes on purpose injected humour and the like";
        System.out.println(getFrequencyOfWords("and", text));
    }

    public static Map<String, Long> getFrequencyOfWords(String word, String text) {
        if (word == null || text == null)
            throw new IllegalArgumentException("Текст или переданное слово не может быть пустым");
        Map<String, Long> frequencyWords = new HashMap<>();
        long countWords = 0;

        String[] strings = text.split(" ");
        for (String string : strings)
            if (string.toLowerCase().equals(word)) countWords++;
        frequencyWords.put(word, countWords);
        return frequencyWords;
    }
}
   