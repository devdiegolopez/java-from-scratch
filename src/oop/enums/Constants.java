package oop.enums;

public enum Constants {
    ERROR_MESSAGE("ERROR UNEXPECTED"),
    NOT_INTEGER("NOT VALID INTEGER");
    private final String value;
    Constants(String value){
        this.value = value;
    }
    public String getValue(){
        return value;
    }
}
