package ru.job4j.stream.additional;

import java.util.List;

public class ReductionWithTwoArguments {
    public static Integer collect(List<Integer> list) {
        return list.stream().reduce(5, (x, y) -> x * y);
    }
}
