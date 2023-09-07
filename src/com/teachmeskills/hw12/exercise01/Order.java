package com.teachmeskills.hw12.exercise01;

public class Order {
    private double price;
    private String description;

    public Order(double price, String description) {
        this.price = price;
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Заказ {" +
                "цена=" + price +
                ", описание='" + description + '\'' +
                '}';
    }
}
