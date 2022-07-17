package ru.job4j.lambda.additional;

import java.util.Arrays;
import java.util.Optional;

public class OptionalIfPresent {

    public static void ifPresent(int[] data) {
        max(data).ifPresent(ln -> System.out.println("Max: " + ln));
    }

    private static Optional<Integer> max(int[] data) {
        Optional<Integer> rsl = Optional.empty();
        if (data.length > 0) {
            rsl = Arrays.stream(data).boxed().max(Integer::compare);
        }
        return rsl;
    }
}