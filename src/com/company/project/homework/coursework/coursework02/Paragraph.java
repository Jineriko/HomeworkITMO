package com.company.project.homework.coursework.coursework02;

import java.util.ArrayList;
import java.util.List;

public class Paragraph {
    private String name;
    private String text;
    private static List<Paragraph> paragraphList = new ArrayList<>(DataStorage.getParagraphName().size());

    public Paragraph(String name, String text) {
        this.name = name;
        this.text = text;
    }

    public void paragraphNameOutput(){
        System.out.println(name);
    }
    public void paragraphTextOutput(){
        System.out.println(text);
    }

    public static List<Paragraph> getParagraphList(){
        for (int i = 0; i < DataStorage.getParagraphName().size(); i++){
            paragraphList.add(new Paragraph(DataStorage.getParagraphName().get(i), DataStorage.getParagraphText().get(i)));
        }
        return paragraphList;
    }

}
