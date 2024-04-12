package com.company.project.homework.lesson26;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Task2 {
    public static void main(String[] args) {
        // Файл большого размера необходимо прочитать и вывести информацию:
        // сколько раз в файле встречается последовательность символов "dd8222kdd8".
        // Информация в файле содержится в виде строк одинакового размера:
        // dd8222kdd8
        // dr82k2k4d8
        // zqw1k2kss8
        // и т.д.
        final String subsequenceChar = "dd8222kdd8";
        int counterSubsequence = 0;
        try(BufferedReader reader = new BufferedReader(new FileReader("filename.txt"))) {
            String line;
            while ((line = reader.readLine()) != null){
                if (line.contains(subsequenceChar)){
                    counterSubsequence++;
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}