package com.company.project.homework.lesson29;

import java.util.*;

public class ThreadData extends Thread {
    private List<StringBuilder> sb = new ArrayList<>();
    private final String[] symbols = {"!", "?", ",", "...", "..", ".", "@", "#", "$", "%", ":", "^", "*", "(", ")",};
    private List<String> allWords = new ArrayList<>();

    public ThreadData(List<StringBuilder> sb) {
        if (sb == null) throw new IllegalArgumentException();
        this.sb = sb;
    }
    public List<String> getAllWords() {
        return allWords;
    }

    @Override
    public void run() {
        for (StringBuilder stringBuilder : sb) {
            synchronized (stringBuilder) {
                String[] elements = stringBuilder.toString().split(" ");
                for (String element : elements) {
                    if (element.contains("!") || element.contains("?") ||
                            element.contains(".") || element.contains(",") || element.contains("...")) {
                        for (String string : symbols) { // если слово имеет символ, удаляем символ
                            if (element.contains(string))
                                element = element.replace(string, "");
                        }
                    }

                    element = element.trim()
                            .toLowerCase();
                    if (element.equals("")) continue; // если слово пустое

                    synchronized (allWords) { // общая коллекция для сбора слов
                        allWords.add(element);
                    }
                }
            }
        }
    }
}
