package ru.job4j.lambda.additional;

import java.util.List;
import java.util.Optional;

public class OptionalOfAndEmpty {
    public static Optional<String> findValue(List<String> strings, String value) {
        Optional<String> rsl = Optional.empty();
        for (String str : strings) {
            if (value.equals(str)) {
                rsl = Optional.of(str);
            }
        }
        return rsl;
    }
}
