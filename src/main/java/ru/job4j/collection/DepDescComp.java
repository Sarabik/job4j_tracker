package ru.job4j.collection;

import java.util.Comparator;

public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String str1, String str2) {
        int result = str1.compareTo(str2);
        if (!str1.substring(0, 2).equals(str2.substring(0, 2))) {
            result = str2.compareTo(str1);
        }
        return result;
    }
}