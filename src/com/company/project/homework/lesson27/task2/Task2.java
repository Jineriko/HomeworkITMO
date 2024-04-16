package com.company.project.homework.lesson27.task2;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class Task2 {
    public static void main(String[] args) {
        /*
    Даны 4 файла с текстовой информацией.
    Строки в файлах имеют следующий вид: id::название-товара::стоимость-товара::количество-на-складе
    Каждый файл должен обрабатываться в отдельном потоке.
    Каждый поток читает информацию из файла и сохраняет её в объект, объект помещает в коллекцию.
    После того как все потоки закончат работу со своими файлами, основной поток должен объединить
     информацию из отдельных коллекций в мапу (ключи - названия, значения - отсортированные по стоимости множества товаров).
    Фоновый поток записывает в файл информацию о прочитанных товарах. Записываемая информация - id:количество-на-складе
        */
        Reader reader01 = new Reader("file1.txt");
        Reader reader02 = new Reader("file2.txt");
        Reader reader03 = new Reader("file3.txt");
        Reader reader04 = new Reader("file4.txt");

        reader01.start();
        reader02.start();
        reader03.start();
        reader04.start();
        try {
            reader01.join(30000);
            reader02.join(30000);
            reader03.join(30000);
            reader04.join(30000); // ожидание 4 потоков
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        List<Product> allProducts = new ArrayList<>(); // создание коллекции для хранения продуктов
        allProducts.addAll(reader01.getProducts());
        allProducts.addAll(reader02.getProducts());
        allProducts.addAll(reader03.getProducts());
        allProducts.addAll(reader04.getProducts());
        allProducts.sort(new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) { // сортировка продуктов по цене
                return (int) (o1.getPrice() - o2.getPrice());
            }
        });

        Thread writerThread = new Thread(()->{ // фоновый поток для записи в файл
            try (BufferedWriter writer = new BufferedWriter(new FileWriter("fileWriter.txt"))){
                for (Product product : allProducts) {
                    writer.write(product.getId() + ":" + product.getCountInStorage());
                    writer.write("\n");
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
        writerThread.setDaemon(true);
        writerThread.setName("DaemonWriter");
        writerThread.start(); // запуск фонового потока

        Map<String, Product> productMap = new LinkedHashMap<>();
        for (Product product : allProducts) {
            if (productMap.containsKey(product.getName()) &&
                    productMap.get(product.getName()).getPrice() == product.getPrice()) { // проверка на одинаковые названия продуктов
                product.setCountInStorage(productMap.get(product.getName()).getCountInStorage() + product.getCountInStorage());
            } else {
                productMap.put(product.getName(), product);
            }
        }
        System.out.println(productMap);
    }
}
