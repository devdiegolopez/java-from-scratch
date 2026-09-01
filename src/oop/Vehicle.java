package oop;

public class Vehicle {
    String model;
    int year;
    double price;

    public Vehicle(){
    }
    public Vehicle(String model, int year, double price){
        this.model = model;
        this.year = year;
        this.price = price;
    }
    public String getModel(){
        return this.model;
    }

    public double getPrice() {
        return price;
    }

    public int getYear() {
        return year;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Vehicle:" +model+", year " +year+", price: " +price;
    }
    @Override
    public boolean equals(Object obj) {
        Vehicle vehicle = (Vehicle) obj;
        return this.model == vehicle.model ;
    }
}