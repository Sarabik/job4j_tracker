package ru.job4j.collection.additional;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Pangram {
    public static boolean checkString(String s) {
        String formatStr = s.toLowerCase().replace(" ", "");
        Set<String> set = new HashSet<>(List.of(formatStr.split("")));
        return set.size() == 26;
    }
}