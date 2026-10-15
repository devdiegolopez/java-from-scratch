package amigoscode;

import bloque2.modernjava.exercise.model.Contact;

public record Person (String name, Gender gender, int age, Contact contact){
    public Person(String name,Gender gender,int age){
        this(name,gender,age,null);
    }
}
