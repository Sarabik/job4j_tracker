package ru.job4j.stream.additional;

import java.util.Comparator;
import java.util.List;

public class MinMethod {
    public static String min(List<String> list) {
        return list.stream().min((n1, n2) -> n1.compareTo(n2)).get();
    }
}
