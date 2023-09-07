package com.teachmeskills.hw12.exercise01;

import java.util.ArrayList;
import java.util.List;

public class Client {
    private String registrationDate;
    private String name;
    private int age;
    private List<Order> orders = new ArrayList<>();

    public Client(String registrationDate, String name, int age) {
        this.registrationDate = registrationDate;
        this.name = name;
        this.age = age;
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    public List<Order> getOrders() {
        return orders;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Заказчик {" +
                "дата регистрации='" + registrationDate + '\'' +
                ", имя='" + name + '\'' +
                ", возраст=" + age +
                ", заказы=" + orders +
                '}';
    }
}
