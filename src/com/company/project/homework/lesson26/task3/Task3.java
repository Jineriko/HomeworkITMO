package com.company.project.homework.lesson26.task3;

import javax.crypto.CipherInputStream;
import java.io.*;

public class Task3 {
    public static void main(String[] args) {
        // Реализовать декораторы для `InputStream` и `OutputStream`, которые шифруют и дешифруют байты (^)XOR шифрованием.
        // Декораторы должны наследоваться от `FilterInputStream` и `FilterOutputStream`.
        try (XORInputStream inputStream = new XORInputStream(new FileInputStream("text.txt"), (byte) 16);
             XOROutputStream outputStream = new XOROutputStream(new FileOutputStream("text2.txt"), (byte) 16)) {
            int data;
            while (inputStream.available() > 0){
                data = inputStream.read();
                System.out.print(data + " "); // вывод нв а экран шифрования
                outputStream.write(data);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}