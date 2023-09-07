package com.teachmeskills.hw12.exercise01;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Client client1 = new Client("2023-08-06", "Иван", 30);
        client1.addOrder(new Order(100, "Товар 1"));
        client1.addOrder(new Order(50, "Товар 2"));

        Client client2 = new Client("2023-07-07", "Елена", 25);
        client2.addOrder(new Order(200, "Товар 3"));

        Client client3 = new Client("2023-06-08", "Алексей", 40);
        client3.addOrder(new Order(150, "Товар 4"));

        Map<String, Client> clientMap = new HashMap<>();
        clientMap.put(PassportNumbers.PASSPORT_NUMBER_1, client1);
        clientMap.put(PassportNumbers.PASSPORT_NUMBER_2, client2);
        clientMap.put(PassportNumbers.PASSPORT_NUMBER_3, client3);

        System.out.println("Все пары ключ-значение:");
        for (Map.Entry<String, Client> entry : clientMap.entrySet()) {
            System.out.println("Номер паспорта: " + entry.getKey());
            System.out.println("Клиент: " + entry.getValue().getName());
            System.out.println("Возраст клиента: " + entry.getValue().getAge());
            System.out.println("Заказы клиента:");
            for (Order order : entry.getValue().getOrders()) {
                System.out.println("Описание: " + order.getDescription() + ", Цена: " + order.getPrice());
            }
        }

        System.out.println("\nВсе пары ключ-значение, используя итератор:");
        Iterator<Map.Entry<String, Client>> iterator = clientMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Client> entry = iterator.next();
            System.out.println("Номер паспорта: " + entry.getKey());
            System.out.println("Клиент: " + entry.getValue().getName());
            System.out.println("Возраст клиента: " + entry.getValue().getAge());
            System.out.println("Заказы клиента:");
            for (Order order : entry.getValue().getOrders()) {
                System.out.println("Описание: " + order.getDescription() + ", Цена: " + order.getPrice());
            }
        }

        System.out.println("\nВсе ключи (номера паспортов): " + clientMap.keySet());

        System.out.println("\nВсе значения (клиенты): " + clientMap.values());
    }
}

