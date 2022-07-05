package ru.job4j.collection.additional;

import java.util.List;

public class RemoveIf {
    public static List<String> sortList(List<String> list) {
        list.removeIf(s -> s.length() < 5);
        return list;
    }
}