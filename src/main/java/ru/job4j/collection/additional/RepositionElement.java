package ru.job4j.collection.additional;

import java.util.List;

public class RepositionElement {
    public static List<String> changePosition(List<String> list, int index) {
        int i = list.size() - 1;
        String rem = list.remove(i);
        if (index < i) {
            list.set(index, rem);
        }
        return list;
    }
}