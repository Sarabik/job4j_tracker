package ru.job4j.lambda.additional;

import java.util.Optional;

public class OptionalGetAndIsPresent {

    public static int get(int[] data, int el) {
        return indexOf(data, el).isPresent() ? indexOf(data, el).get() : -1;
    }

    private static Optional<Integer> indexOf(int[] data, int el) {
        Optional<Integer> rsl = Optional.empty();
        for (int i = 0; i < data.length; i++) {
            rsl = el == data[i] ? Optional.of(i) : rsl;
        }
        return rsl;
    }
}