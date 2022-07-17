package ru.job4j.collection.additional;

import java.util.*;

public class Concordance {
    public static Map<Character, List<Integer>> collectCharacters(String s) {
        Map<Character, List<Integer>> rsl = new HashMap<>();
        char[] arr = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            int ind = i;
            if (arr[i] == ' ') {
                continue;
            }
            rsl.computeIfPresent(arr[i], (key, value) -> new ArrayList<Integer>() {{
                addAll(value);
                add(ind);
            }});
            rsl.putIfAbsent(arr[i], Arrays.asList(i));
        }
        return rsl;
    }
}
