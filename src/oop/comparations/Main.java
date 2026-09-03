package oop.comparations;

import oop.enums.Constants;
import oop.enums.VehicleException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    static void main(String[] args) {
        Persona persona1 = new Persona("Diego",33);
        Persona persona2 = new Persona("Benji",6);
        Persona persona3 = new Persona("dani",100);
        int older = persona1.compareTo(persona2);
        String oldest = older == 1?persona1.getName()+" es mayor": persona1.getName()+" es menor";
        System.out.println(oldest);
        List<Persona> personaList = new ArrayList<>();
        personaList.add(persona1);
        personaList.add(persona2);
        personaList.add(persona3);
        personaList.forEach(System.out::print);
        Collections.sort(personaList);
        System.out.println();
        personaList.forEach(System.out::print);
        Deposit deposit = new Deposit(true,1200.00,10000);
        Deposit deposit2 = new Deposit(false,12000.00,10000);
        System.out.println();
        int ok = deposit.compare(deposit2,deposit2);
        try {
            if (ok == 1) {
                System.out.println("successful");
            } else {
                throw new VehicleException(Constants.NOT_ENOUGH_BUDGET);
            }
        } catch (VehicleException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(ok);
        System.out.println(ok);
    }
}