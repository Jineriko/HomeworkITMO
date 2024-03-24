package com.company.project.homework.lesson18;

import com.company.project.homework.lesson14.Car;
import com.company.project.homework.lesson14.Repaintable;
import com.company.project.homework.lesson14.Train;
import com.company.project.homework.lesson14.Vehicle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task1 {
    public static void main(String[] args) {
        /* Написать метод, принимающий на вход мапу и уровень износа. Ключи мапы - номера транспортных средств,
        значения - любые транспортные средства. Метод возвращает список транспортных средств,
        уровень износа которых больше переданного в метод. */
        Car car01 = new Car(Repaintable.Color.BLACK, "01");
        car01.setLevelOfWare(40);
        Vehicle train01 = new Train("02", 10, true);
        train01.setLevelOfWare(55);
        Car car02 = new Car(Repaintable.Color.BLACK, "01");
        car02.setLevelOfWare(15);
        Vehicle train02 = new Train("02", 10, true);
        train02.setLevelOfWare(24);
        List<Vehicle> vehicleList = List.of(car01, train02, car02, train01);
        Map<String, List<Vehicle>> vehicleMap = new HashMap<>();
        vehicleMap.put("1", vehicleList);

        System.out.println(getVehicleLevelOfWare(vehicleMap, 20));
    }
    public static List<Vehicle> getVehicleLevelOfWare (Map<String, List<Vehicle>> vehicles, int levelOfWare){
        if (vehicles == null || levelOfWare < 1) throw new IllegalArgumentException();
        List<Vehicle> vehicleList = new ArrayList<>();

        List<List<Vehicle>> temp = new ArrayList<>(vehicles.values()); // создается коллекция коллекций транспортных средств
        for (List<Vehicle> vehicleCollection : temp){ // for each для каждой коллекции
            if (vehicleCollection == null) throw new IllegalArgumentException();
            for (Vehicle vehicle : vehicleCollection){ // for each для каждой машины в коллекции
                if (vehicle == null) throw new IllegalArgumentException();
                if (vehicle.getLevelOfWare() > levelOfWare) // условие добавления в конечную коллекцию
                    vehicleList.add(vehicle);
            }
        }
        return vehicleList;
    }
}
