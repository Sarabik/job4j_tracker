package ru.job4j.collection;

import java.util.HashMap;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> data = new HashMap<>();
        data.put("tomo@mail.ru", "Funin Maksim Igorevich");
        data.put("oleg@mail.ru", "Ribov Oleg Petrovich");
        data.put("ur@mail.ru", "Lavrin Anton Denisovich");
        for (String key : data.keySet()) {
            System.out.printf("e-mail: %s, ФИО: %s%n", key, data.get(key));
        }
    }
}
