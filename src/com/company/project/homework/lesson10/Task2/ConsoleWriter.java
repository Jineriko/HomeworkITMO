package com.company.project.homework.lesson10.Task2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class ConsoleWriter implements Writer {
    @Override
    public void log(String dataInput){
        System.out.println(dataInput);
    }
}
