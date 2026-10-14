package amigoscode.declarative;
import amigoscode.imperative.Gender;
import amigoscode.imperative.Person;
import java.util.List;

public class Main {
    static void main(String[] args) {
        List<Person> people = List.of(new Person("liz", Gender.FEMALE,29),
                new Person("diego",Gender.MALE,32),
                new Person("alo",Gender.MALE,35),
                new Person("beno",Gender.MALE,6));
        people.stream()
                .filter(person -> person.gender()
                .equals(Gender.MALE)).toList()
                .forEach(System.out::println);
    }
}