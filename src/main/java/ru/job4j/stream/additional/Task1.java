package ru.job4j.stream.additional;

import java.util.List;
import java.util.stream.Collectors;

public class Task1 {
    public static List<Integer> retain(List<Integer> list) {
        return list.stream()
                .filter(i -> i % 4 != 0)
                .collect(Collectors.toList());
    }
}