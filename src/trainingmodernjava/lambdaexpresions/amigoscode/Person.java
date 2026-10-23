package trainingmodernjava.lambdaexpresions.amigoscode;

import trainingmodernjava.lambdaexpresions.modernjava.exercise.model.Contact;

public record Person (String name, Gender gender, Integer age, Contact contact){
    public Person(String name,Gender gender,int age){
        this(name,gender,age,null);
    }

    public Person(String s) {
        this(s,null,null,null);
    }
}
