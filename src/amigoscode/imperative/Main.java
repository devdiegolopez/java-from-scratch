package amigoscode.imperative;

import amigoscode.Gender;
import amigoscode.Person;

import java.util.List;

public class Main {
    static void main(String[] args) {
        List<Person> people = List.of(new Person("liz", Gender.FEMALE,29),
                new Person("diego",Gender.MALE,32),
                new Person("alo",Gender.MALE,35),
                new Person("beno",Gender.MALE,6));
        for (Person p:people){
            if (Gender.MALE
                    .equals(p.gender())){
                System.out.println(p);
            }
        }
    }
}