package trainingmodernjava.lambdaexpresions.streams;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("diego");
        names.add("benni");
        names.add("kuz");
        names.add("liz");
        List<String> withI = names.stream()
                .filter(name -> name.contains("i")).toList();
        withI.forEach(System.out::println);

    }
}