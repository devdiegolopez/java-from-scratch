package oop.generics;

public class Unit <T>{
    private T content;
    public void measure(T content){
        this.content = content;
    }
    public T getContent(){
        return content;
    }
}
