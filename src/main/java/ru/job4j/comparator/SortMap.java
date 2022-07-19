package ru.job4j.comparator;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class SortMap {
    public static Map<Integer, String> sort(Map<Integer, String> map) {
        TreeMap<Integer, String> mapSort = new TreeMap<>(Comparator.reverseOrder());
        mapSort.putAll(map);
        return mapSort;
    }
}