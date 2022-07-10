package ru.job4j.collection.additional;

import java.util.*;

public class MostUsedCharacter {
    public static char getMaxCount(String str) {
        String strMod = str.toLowerCase().replaceAll(" ", "");
        Map<Character, Integer> map = new TreeMap<>();
        for (char c : strMod.toCharArray()) {
            map.putIfAbsent(c, 1);
            map.computeIfPresent(c, (key, value) -> value + 1);
        }

        int count = 0;
        char rsl = 0;
        for (Map.Entry<Character, Integer> pair : map.entrySet()) {
            if (pair.getValue() > count) {
                count = pair.getValue();
                rsl = pair.getKey();
            }
        }
        return rsl;
    }
}
