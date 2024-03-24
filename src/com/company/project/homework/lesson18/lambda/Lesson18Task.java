package com.company.project.homework.lesson18.lambda;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Lesson18Task {


    public static void main(String[] args) {
        List<Task> taskList = new ArrayList<>();

        // Задание №1
        // удалить задачи методом removeIf,
        // если они были созданы более месяца назад
        // и закрыты (статус CLOSED)
        taskList.removeIf(task -> LocalDateTime.now().getDayOfYear() - task.getCreatedAt().getDayOfYear() > 30 &&
                task.getStatus() == Task.Status.CLOSED);

        // Задание №2
        // Перебрать список методом forEach,
        // вывести в консоль только открытые задачи,
        // которые нужно было завершить к текущему моменту
        taskList.forEach(task -> {
            if (task == null) throw new IllegalArgumentException();
            if (task.getStatus() == Task.Status.IN_PROGRESS && LocalDateTime.now().isAfter(task.getCloseTo()))
                System.out.println(task);
        });

        // Задание №3
        // Перебрать список методом forEach,
        // вывести в консоль только задачи,
        // которые попадают в заданный диапазон дат
        LocalDateTime dateStart = LocalDateTime.now().minusMonths(1);
        LocalDateTime dateEnd = LocalDateTime.now();

        taskList.forEach(task -> {
            if (task == null) throw new IllegalArgumentException();
            if (task.getCreatedAt().isAfter(dateStart) && task.getCreatedAt().isBefore(dateEnd))
                System.out.println(task);
        });

        // Задание №4
        // Написать реализацию Function,
        // которая принимает на вход список задач,
        // и возвращает список с названиями
        // выполненных задач
        // в отсортированном по дате завершения виде
        Function<List<Task>, List<String>> completedTask = tasks -> {
            List<Task> comletedList = new ArrayList<>(); // создается новая коллекция для хранения всех тасков
            tasks.forEach(task -> {
                if (task == null) throw new IllegalArgumentException();
                comletedList.add(task); // добавление всех тасков в коллекцию
            });
            comletedList.removeIf(task -> task.getStatus() != Task.Status.CLOSED); // удаление всех тасков, кроме тех у которых статус CLOSE
            comletedList.sort(new Task.CloseToComparator()); // сортировка оставшихся тасков по дате закрытия, с помощью компаратора
            List<String> sortedList = new ArrayList<>(); // создание коллекции строк, где будут хранится title
            comletedList.forEach(element -> sortedList.add(element.getTitle())); // наполнение коллекции title
            return sortedList;
        };


    }



}