package ru.job4j.stream.additional;

import java.util.List;

public class MapToIntMethod {
    public static long sum(List<Character> characters) {
        return characters.stream()
                .mapToInt(Character::charValue)
                .sum();
    }
}
