package ru.job4j.lambda.additional;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class OptionalOfNullable {
    public static Optional<String> findValue(List<String> strings, String value) {
        Optional<String> rsl = Optional.empty();
        for (String str : strings) {
            if (Objects.equals(value, str)) {
                rsl = Optional.ofNullable(str);
            }
        }
        return rsl;
    }
}