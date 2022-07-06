package ru.job4j.collection.additional;

import java.util.*;

public class Alphabet {
    public static String reformat(String s) {
        List<String> list = new ArrayList<>();
        Collections.addAll(list, s.split(""));
        Comparator<String> comp = String::compareTo;
        list.sort(comp);
        StringBuilder sb = new StringBuilder();
        for (String str : list) {
            sb.append(str);
        }
        return sb.toString();
    }
}