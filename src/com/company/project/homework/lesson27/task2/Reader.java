package com.company.project.homework.lesson27.task2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Reader extends Thread{
    private String filename;
    private List<Product> products;

    public Reader(String filename) {
        if (filename == null) throw new IllegalArgumentException();
        this.filename = filename;
        products = new ArrayList<>();
    }

    public List<Product> getProducts() {
        return products;
    }

    public void run(){
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))){
            String line;
            String[] elementInString = new String[4];
            while ((line = reader.readLine()) != null){
                elementInString = line.split("::");
                products.add(new Product(elementInString[0],
                        elementInString[1],
                        Double.parseDouble(elementInString[2]),
                        Integer.parseInt(elementInString[3])));
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
