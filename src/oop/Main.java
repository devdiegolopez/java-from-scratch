package oop;

import oop.exceptions.VehicleException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

public class Main {
    public static void main(String[] args){
        Vehicle vehicle = new Car("Ibiza",2026,199.999,120,5);
        Vehicle vehiclecopy = new Car("Ibiza",2026,199.999,120,5);
        System.out.println(vehicle.equals(vehiclecopy));
        List<Vehicle> list = new ArrayList<>();
        list.add(vehicle);
        try {
            if (list.stream()
                    .anyMatch(v -> v.getModel().equals(vehiclecopy.getModel()))) {

                throw new VehicleException("Vehicle already exists");

            }

            list.add(vehiclecopy);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        List<Vehicle> list2 = list;
        System.out.println(list);
        HashMap<UUID,List> map = new HashMap<>();
        map.put(UUID.fromString(UUID.randomUUID().toString()),list);
        map.put(UUID.fromString(UUID.randomUUID().toString()),list2);
        System.out.println(map);
    }
}