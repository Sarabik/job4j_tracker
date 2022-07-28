package ru.job4j.collection.additional;

import java.util.List;
import java.util.stream.Collectors;

public class Task5 {
    public static List<Integer> multiAssign(List<Task> tasks) {
        return tasks.stream()
                .collect(Collectors.groupingBy(Task::assignId, Collectors.counting()))
                .entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .map(entry -> entry.getKey())
                .collect(Collectors.toList());
    }

    public record Task(Integer taskId, Integer assignId) {
    }
}
