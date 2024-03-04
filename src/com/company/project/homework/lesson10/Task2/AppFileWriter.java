package com.company.project.homework.lesson10.Task2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class AppFileWriter implements Writer {
    private String filename;

    public AppFileWriter(String filename) {
        if (filename == null) throw new IllegalArgumentException("Путь не может быть пустым");
        this.filename = filename;
    }
    @Override
    public void log(String dataInput){
        String data = dataInput;
        try {
            Files.writeString(Path.of(filename), data, StandardOpenOption.CREATE, StandardOpenOption.APPEND);
        } catch (
                IOException e) {
            throw new RuntimeException(e);
        }
    }

}
