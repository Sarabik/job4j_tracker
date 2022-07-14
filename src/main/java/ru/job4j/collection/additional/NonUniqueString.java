package ru.job4j.collection.additional;

import java.util.HashMap;
import java.util.Map;

public class NonUniqueString {
    public static Map<String, Boolean> checkData(String[] strings) {
        Map<String, Boolean> map = new HashMap<>();
        for (String str : strings) {
            if (map.putIfAbsent(str, false) != null) {
                map.put(str, true);
            }
        }
        return map;
    }
}
