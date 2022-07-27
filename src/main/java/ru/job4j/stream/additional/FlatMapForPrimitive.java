package ru.job4j.stream.additional;

import java.util.Arrays;

public class FlatMapForPrimitive {
    public static int sum(int[][] matrix) {
        return Arrays.stream(matrix)
                .flatMapToInt(ar -> Arrays.stream(ar))
                .sum();
    }
}
