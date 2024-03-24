package com.company.project.homework.lesson18;

import com.company.project.homework.lesson14.Repaintable;

import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        /* Написать метод, принимающий на вход список перекрашиваемых объектов и мапу,
        где ключи - цвета, а значения - списки покрашенных в данный цвет объектов.
        В методе необходимо наполнить мапу элементами списка. */
    }
    public static void repaintableObjects(List<Repaintable> repaintableList,
                                          Map<Repaintable.Color, List<Repaintable>> colorListMap){
        if (repaintableList == null || colorListMap == null) throw new IllegalArgumentException();
        for (Repaintable.Color color : colorListMap.keySet()) { // в цикле проходим по каждому цвету
            for (Repaintable repaintable : repaintableList) { // проходим по каждому элементу в коллекции
                if (repaintable == null) throw new IllegalArgumentException();
                repaintable.changeColor(color); // меняем цвет на цвет ключа мапы
                if (colorListMap.get(color) == null)
                    colorListMap.put(color, new ArrayList<>()); // создание новой коллекции в значении, если раньше не было
                colorListMap.get(color).add(repaintable); // добавление в значение мапы
            }
        }
    }
}
