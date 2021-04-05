package com.bean;

public class Car {
    private String name;
    private int price;
    private int speet;
    private int manyPeople;

    public Car(String name, int price, int speet) {
        this.name = name;
        this.price = price;
        this.speet = speet;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", speet=" + speet +
                ", manyPeople=" + manyPeople +
                '}';
    }
}
