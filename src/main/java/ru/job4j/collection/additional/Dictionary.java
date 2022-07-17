package ru.job4j.collection.additional;

import java.util.*;
import java.util.stream.Collectors;

public class Dictionary {
    public static Map<String, List<String>> collectData(String[] strings) {
        Map<String, List<String>> rsl = Arrays.stream(strings)
                .collect(Collectors.groupingBy((str) -> str.substring(0, 1)));
        return rsl;
    }
}
