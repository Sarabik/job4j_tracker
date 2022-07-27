package ru.job4j.collection.additional;

import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FreezeStr {
    public static boolean eq(String left, String right) {
        Map<Character, Long> leftMap = left.chars()
                .mapToObj(ch -> (Character) ((char) ch))
                .collect(Collectors.groupingBy(Function.identity(), TreeMap::new, Collectors.counting()));
        Map<Character, Long> rightMap = right.chars()
                .mapToObj(ch -> (Character) ((char) ch))
                .collect(Collectors.groupingBy(Function.identity(), TreeMap:: new, Collectors.counting()));

        return leftMap.equals(rightMap);
    }
}
