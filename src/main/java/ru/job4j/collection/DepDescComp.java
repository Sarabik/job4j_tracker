package ru.job4j.collection;

import java.util.Comparator;

public class DepDescComp implements Comparator<String> {

    @Override
    public int compare(String str1, String str2) {
        int result = str2.split("/", 2)[0].compareTo(str1.split("/", 2)[0]);
        if (result == 0) {
            result = str1.compareTo(str2);
        }
        return result;
    }
}