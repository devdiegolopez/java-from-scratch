package amigoscode.declarative;
import amigoscode.Gender;
import amigoscode.Person;
import bloque2.modernjava.exercise.model.Contact;
import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);
    static void main(String[] args) {
        List<Person> people = List.of(
                new Person("liz", Gender.FEMALE,29),
                new Person("diego",Gender.MALE,32),
                new Person("alo",Gender.MALE,35),
                new Person("beno",Gender.MALE,6,new Contact("principal","5637838646")));
        List<Integer> ages = people.stream().map(Person::age).sorted().toList();
        logger.info(ages.toString());
        Predicate<Person> isMale = person -> person.gender().equals(Gender.MALE);
        boolean females = people.stream().allMatch(isMale);
        logger.info(String.valueOf(females));
        List<Person> males =  people.stream()
                .filter(isMale).toList();
        logger.info(males.toString());
        Integer resFunction = incrementByOne.apply(999);
        logger.info(resFunction.toString());
        Long increment2 = incrementByTwo.apply(10.0,10.0);
        logger.info(increment2.toString());
        final String myNum = "5691442348";
        logger.info(String.valueOf(isPhoneValid(myNum)));
        boolean phone = isPhoneValidLambda.test("5691442348");
        logger.error("IS VALID?: {}", phone);
        logger.info(getDBConnection.get());
        Person random = getPerson.get();
        logger.info(String.valueOf(random));
        List<Integer> evenNums = filtering.apply(List.of(1,2,3,4,5,6,7,8,9,10));
        int totalEven = evenNums.stream().mapToInt(Integer::intValue).sum();
        logger.info(evenNums.toString());
        logger.info(String.valueOf(totalEven));
    }
    static Function<Integer,Integer> incrementByOne = num -> num+1;
    static BiFunction<Double,Double,Long> incrementByTwo = (n1,n2) -> (long) (Math.pow(n1,n2) * 2);
    static boolean isPhoneValid(String phoneNumber){
        return phoneNumber.startsWith("55") && phoneNumber.length() == 10;
    }
    static Predicate<String> isPhoneValidLambda = p -> p.length() == 10 && p.startsWith("55");
    static Supplier<String> getDBConnection = () -> "getConnectionParams";
    static Supplier<Person> getPerson = () -> new Person(UUID.randomUUID().toString(),Gender.MALE, (int) (Math.random()*10));
    static Function<List<Integer>,List<Integer>> filtering = list -> list.stream().filter(integer -> integer % 2== 0).toList();

}