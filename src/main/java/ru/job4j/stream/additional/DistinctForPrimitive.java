package ru.job4j.stream.additional;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctForPrimitive {
    public static List<Integer> collect(int[] data) {
        return Arrays.stream(data)
                .boxed()
                .distinct()
                .collect(Collectors.toList());
    }
}
