package com.teachmeskills.hw12.exercise01;

public class Main {
    public static void main(String[] args) {
        Client client1 = new Client("2023-08-06", "Иван", 30);
        Client client2 = new Client("2023-07-07", "Елена", 25);
        Client client3 = new Client("2023-06-08", "Алексей", 40);

        Order order1 = new Order(100, "Товар 1");
        Order order2 = new Order(50, "Товар 2");
        Order order3 = new Order(200, "Товар 3");

        client1.addOrder(order1);
        client1.addOrder(order2);

        client2.addOrder(order3);

        System.out.println("Информация о клиенте 1:");
        System.out.println("Имя: " + client1.getName());
        System.out.println("Возраст: " + client1.getAge());
        System.out.println("Заказы:");
        for (Order order : client1.getOrders()) {
            System.out.println("Описание: " + order.getDescription() + ", Цена: " + order.getPrice());
        }

        System.out.println("\nИнформация о клиенте 2:");
        System.out.println("Имя: " + client2.getName());
        System.out.println("Возраст: " + client2.getAge());
        System.out.println("Заказы:");
        for (Order order : client2.getOrders()) {
            System.out.println("Описание: " + order.getDescription() + ", Цена: " + order.getPrice());
        }
    }
}
