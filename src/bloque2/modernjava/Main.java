package bloque2.modernjava;

import bloque1.oop.comparations.Persona;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    static void main(String[] args) {
        List<Persona> people = List.of(
            new Persona("liz",29),
                new Persona("Diego",32),
                new Persona("Benji",6)
        );
        List<Persona> legalPeople = new ArrayList<>();
        Predicate<Persona> personaPredicate = persona -> persona.getAge() > 18;
        legalPeople.add((Persona) (legalPeople = people.stream()
                        .filter(personaPredicate)
                        .toList()));

        System.out.println("lol"+legalPeople);

    }
}
