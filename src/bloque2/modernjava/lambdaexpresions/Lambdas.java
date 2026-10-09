package bloque2.modernjava.lambdaexpresions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lambdas {
    static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("zlol");
        list.add("lolo");
        System.out.println(list);
        Collections.sort(list,(String o, String x) -> o.compareTo(x));
        System.out.println(list);
        Calculator division = (x,y) -> x/y;
        System.out.println(division.operation(10,20));
        Calculator addition = (x,y) -> x+y;
        System.out.println(addition.operation(10,10));
        Calculator substraction = (x,y) -> x-y;
        System.out.println(substraction.operation(10,3));
        Animal animal = new Animal() {
            @Override
            public void makeNoise(String name,int n) {
                System.out.println("barking "+name+n);
            }
        };
        animal.makeNoise("janis",10);
        Animal functionalAnimal = (s,m) -> {
            System.out.println("functional animal lol "+ s); 
            for (int i = 0; i < m; i++) {
                System.out.println("functional animal lol xxxxxxxx "+ s);
            }
        };
        functionalAnimal.makeNoise("jano",30);
    }
}
@FunctionalInterface
interface Calculator{
    double operation(double x, double y);
}