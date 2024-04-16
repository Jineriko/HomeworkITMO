package com.company.project.homework.lesson27.task1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDateTime;

public class Reader extends Thread {
    private LocalDateTime dateTime;
    private int priority;
    private String infoAboutEvent;
    private int counterMessage;
    private String filename;

    public Reader(String fileName) {
        this.filename = fileName;
    }

    public void run() {
        counterMessage = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            String[] elementInString = new String[3];
            while ((line = reader.readLine()) != null) {
                elementInString = line.split("::");
                if (Integer.parseInt(elementInString[1]) >= 7) {
                    System.out.println(elementInString[2]);
                    counterMessage++;
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Сообщений с приоритетом 7 и выше = " + counterMessage);
    }

}
