package com.teachmeskills.hw12.exercise02;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, Client> clientMap = new HashMap<>();
        clientMap.put(PassportNumbers.PASSPORT_NUMBER_1, new Client("Иван"));
        clientMap.put(PassportNumbers.PASSPORT_NUMBER_2, new Client("Елена"));
        clientMap.put(PassportNumbers.PASSPORT_NUMBER_3, new Client("Алексей"));

        for (Map.Entry<String, Client> entry : clientMap.entrySet()) {
            System.out.println("Номер паспорта: " + entry.getKey() + ", Клиент: " + entry.getValue().getName());
        }

        Iterator<Map.Entry<String, Client>> iterator = clientMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Client> entry = iterator.next();
            System.out.println("Номер паспорта: " + entry.getKey() + ", Клиент: " + entry.getValue().getName());
        }

        System.out.println("Все ключи (номера паспортов): " + clientMap.keySet());

        Collection<Client> clients = clientMap.values();
        List<String> uniqueNames = new ArrayList<>();
        for (Client client : clients) {
            uniqueNames.add(client.getName());
        }

        System.out.println("Все значения (имена клиентов): " + uniqueNames);
    }
}
