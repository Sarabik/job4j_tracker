package ru.job4j.collection.additional;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task3 {
    public static List<Integer> extractDuplicates(List<Integer> left, List<Integer> right) {
        return Stream.concat(left.stream(), right.stream())
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .map(entry -> entry.getKey())
                .collect(Collectors.toList());
    }
}