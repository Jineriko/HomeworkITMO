package com.company.project.homework.coursework.coursework02.gamePlay;

import java.util.ArrayList;
import java.util.List;

public class Paragraph { // класс для объединения параграфа и текста
    private static DataStorage dataStorage = DataStorage.getData();
    private String name;
    private String text;
    private static List<Paragraph> paragraphList = new ArrayList<>(dataStorage.getParagraphName().size());

    static {
        for (int i = 0; i < dataStorage.getParagraphName().size(); i++) {
            paragraphList.add(new Paragraph(dataStorage.getParagraphName().get(i), dataStorage.getParagraphText().get(i)));
        }
    }

    public Paragraph(String name, String text) {
        this.name = name;
        this.text = text;
    }

    public void paragraphNameOutput() {
        System.out.println(name);
    }

    public void paragraphTextOutput() {
        System.out.println(text);
    }

    public static List<Paragraph> getParagraphList() {
        return paragraphList;
    }
}
