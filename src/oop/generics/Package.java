package oop.generics;

public class Package <T>{
    private T type;

    public void addContent(T type){
        this.type = type;
    }
    public T getContent(){
        return type;
    }
}
