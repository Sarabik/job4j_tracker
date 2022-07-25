package ru.job4j.stream.additional;

import java.util.List;

public class AnyMatchMethod {
    public static boolean check(List<String> data) {
        return data.stream()
                .anyMatch(str -> str.startsWith("job4j"));
    }
}