package com.teachmeskills.hw12.exercise01;

import java.util.ArrayList;
import java.util.List;

class Client {
    private String registrationDate;
    private String name;
    private int age;
    private List<Order> orders = new ArrayList<>();

    public Client(String registrationDate, String name, int age) {
        this.registrationDate = registrationDate;
        this.name = name;
        this.age = age;
    }

    public String getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(String registrationDate) {
        this.registrationDate = registrationDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    public List<Order> getOrders() {
        return orders;
    }
}
