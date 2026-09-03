package oop.comparations;

public class Persona implements Comparable<Persona>{
    String name;
    int age;

    public Persona(){}
    public Persona(String name, int age){
        this.name = name;
        this.age = age;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Persona{");
        sb.append("name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int compareTo(Persona o) {
        if (this.age > o.age){
            return 1;
        }
        if (this.age < o.age){
            return -1;
        }
        return 0;
    }
}
