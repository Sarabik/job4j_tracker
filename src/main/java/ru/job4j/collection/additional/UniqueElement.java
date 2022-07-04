package ru.job4j.collection.additional;

import java.util.List;

public class UniqueElement {
    public static boolean checkList(List<String> list, String str) {
        return list.indexOf(str) == list.lastIndexOf(str) && list.contains(str);
    }
}