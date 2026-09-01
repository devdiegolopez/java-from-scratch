package oop;

public class Car extends Vehicle{
    int hp;
    int seats;
    public Car(){
    }
    public Car(String model, int year, double price, int hp, int seats){
        super(model, year, price);
        this.hp = hp;
        this.seats = seats;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }
    public String toString(){
        return super.toString() + ", hp:"+ hp + ", seats: " + seats;
    }
}
