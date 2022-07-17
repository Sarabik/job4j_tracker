package ru.job4j.lambda.additional;

import java.util.function.Consumer;

public class ConsumerAndThen {
    public static Consumer<String> consumer(String input) {
        Consumer<String> print = System.out::println;
        Consumer<String> ln = in -> System.lineSeparator();
        return print.andThen(ln);
    }
}
