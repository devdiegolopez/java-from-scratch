package oop;

import oop.enums.Constants;
import oop.enums.VehicleException;
import oop.generics.Unit;
import oop.generics.Package;
import oop.inner.Backpack;

import java.util.*;

public class Main {
    public static void main(String[] args){
        int val = 0;
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"diego");
        map.put(2,"benji");
        map.put(3,"alo");
        map.put(4,"diego");
        map.put(5,"benji");
        map.put(6,"alo");
        map.put(7,"diego");
        map.put(8,"benji");
        map.put(9,"alo");
        map.put(10,"diego");
        map.put(11,"benji");
        map.put(12,"alo");
        Iterator<String> iterator = map.values().iterator();
        while (iterator.hasNext()){
            String element = iterator.next();
            System.out.println(element);
            iterator.remove();
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println(map);
            System.out.println("enter a key to get its value");
            val = scanner.nextInt();
            if (val < 0 ) {
            throw new VehicleException(Constants.NOT_INTEGER);
            }
        String value = map.get(val);
        System.out.println(value);
         Backpack fjallraven = new Backpack("14 L");
        Backpack.Personal laptopBackpack = new Backpack.Personal("carry");
        System.out.println(laptopBackpack);

        Vehicle vehicle = new Car("Ibiza",2026,199.999,120,5);
        Vehicle vehiclecopy = new Car("Ibiza",2026,199.999,120,5);
        Set<Vehicle> vehiclesSet = new HashSet<>();
        vehiclesSet.add(vehicle);
        vehiclesSet.add(vehiclecopy);
        vehiclesSet.add(vehiclecopy);
        System.out.println("set: "+vehiclesSet);
        System.out.println(vehicle.equals(vehiclecopy));
        List<Vehicle> list = new ArrayList<>();
        list.add(vehicle);
        Unit<String> unitString = new Unit<>();
        Unit<Integer> unitInteger = new Unit<>();
        Unit<String[]> unitArray = new Unit<>();
        unitString.measure("que rollo");
        unitInteger.measure(123);
        unitArray.measure(new String[]{"kilo","mile"});
        String stringVal = unitString.getContent();
        Integer intVal = unitInteger.getContent();
        String[] arrayVal = unitArray.getContent();
        System.out.println(stringVal+  intVal+ Arrays.toString(arrayVal));
        Package<String> stringPackage = new Package<>();
        stringPackage.addContent("cellphone");
        System.out.println(stringPackage.getContent() );
        try {
            if (list.stream()
                    .anyMatch(v -> v.getModel().equals(vehiclecopy.getModel()))) {
                throw new VehicleException(Constants.ERROR_MESSAGE);
            }
            list.add(vehiclecopy);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        List<Vehicle> list2 = list;
        System.out.println(list);
        HashMap<UUID,List> mapa = new HashMap<>();
        mapa.put(UUID.fromString(UUID.randomUUID().toString()),list);
        mapa.put(UUID.fromString(UUID.randomUUID().toString()),list2);
        System.out.println(mapa);
    }
}