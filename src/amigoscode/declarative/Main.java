package amigoscode.declarative;
import amigoscode.Gender;
import amigoscode.Person;
import bloque2.modernjava.exercise.model.Contact;

import java.util.List;
import java.util.UUID;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    static void main(String[] args) {
        List<Person> people = List.of(new Person("liz", Gender.FEMALE,29),
                new Person("diego",Gender.MALE,32),
                new Person("alo",Gender.MALE,35),
                new Person("beno",Gender.MALE,6,new Contact("principal","5637838646")));

        Predicate<Person> isMale = person -> person.gender().equals(Gender.MALE);
        List<Person> males =  people.stream()
                .filter(isMale).toList()
                ;
        males.forEach(System.out::println);
        Integer resFunction = incrementByOne.apply(999);
        System.out.println(resFunction);
        Long increment2 = incrementByTwo.apply(10.0,10.0);
        System.out.println(increment2);
        final String myNum = "5691442348";
        System.out.println(isPhoneValid(myNum));
        boolean phone = isPhoneValidLambda.test("5691442348");
        System.out.println(phone);
        System.out.println(getDBConnection.get());
        Person random = getPerson.get();
        System.out.println(random);
    }
    static Function<Integer,Integer> incrementByOne = num -> num+1;
    static BiFunction<Double,Double,Long> incrementByTwo = (n1,n2) -> (long) (Math.pow(n1,n2) * 2);
    static boolean isPhoneValid(String phoneNumber){
        return phoneNumber.startsWith("55") && phoneNumber.length() == 10;
    }
    static Predicate<String> isPhoneValidLambda = p -> p.length() == 10 && p.startsWith("55");
    static Supplier<String> getDBConnection = () -> "getConnectionParams";
    static Supplier<Person> getPerson = () -> new Person(UUID.randomUUID().toString(),Gender.MALE, (int) (Math.random()*10));
}