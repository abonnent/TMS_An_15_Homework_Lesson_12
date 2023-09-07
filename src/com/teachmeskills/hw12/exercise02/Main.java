package com.teachmeskills.hw12.exercise02;

import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<String> names = new TreeSet<>();

        names.add("Роман");
        names.add("Андрей");
        names.add("Глеб");
        names.add("Дмитрий");
        names.add("Татьяна");
        names.add("Татьяна");
        names.add("Роман");
        names.add("Андрей");
        names.add("Довлет");

        System.out.println("Уникальные имена в группе:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}

