package ru.job4j.stream.additional;

import java.util.Arrays;

public class TerminalForPrimitive {

    private int[] data;

    public TerminalForPrimitive(int[] data) {
        this.data = data;
    }

    public long count() {
        return Arrays.stream(data).count();
    }

    public long max() {
        return Arrays.stream(data).max().orElse(0);
    }

    public long min() {
        return Arrays.stream(data).min().orElse(0);
    }

    public double avg() {
        return Arrays.stream(data).average().orElse(0);
    }

    public long sum() {
        return Arrays.stream(data).sum();
    }

}