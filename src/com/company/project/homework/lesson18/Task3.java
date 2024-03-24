package com.company.project.homework.lesson18;

import com.company.project.homework.lesson14.Repairable;
import com.company.project.homework.lesson14.Vehicle;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task3 {
    public static void main(String[] args) {
        /* Написать метод, принимающий на вход список ремонтируемых транспортных средств и возвращающий мапу,
        где ключи - номера транспортных средств, а значения - любые транспортные средства.
        В методе необходимо вызвать метод repair транспортного средства, после чего
        добавить транспортное средство в результирующую мапу. */
    }
    public static Map<String, Vehicle> repairVehicle(List<Vehicle> repairableVehicleList){
        if (repairableVehicleList == null) throw new IllegalArgumentException();
        Map<String, Vehicle> repairableVehicleMap = new HashMap<>();

        for (Vehicle repairableVehicle : repairableVehicleList) { // проходим по каждому транспортному средству
            if (repairableVehicle == null) throw new IllegalArgumentException();
            repairableVehicle.repair();
            repairableVehicleMap.put(repairableVehicle.getNumber(), repairableVehicle);
        }
        return repairableVehicleMap;
    }
}
