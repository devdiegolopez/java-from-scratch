package oop.dtos;

import java.util.Optional;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        UserResponse userResponse = new UserResponse("Diego",32);
        System.out.println(userResponse.age());

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a num");
        Optional<Integer> optionalInteger= Optional.of(scanner.nextInt());
        System.out.println(optionalInteger);
        System.out.println(nameEquals("diego"));
    }
    public static Optional<String> nameEquals(String name){
        if (name.equalsIgnoreCase("diego")){
            return Optional.of("diego");
        }return Optional.empty();
    }
}
