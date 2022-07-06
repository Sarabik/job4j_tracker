package ru.job4j.collection.additional;

import java.util.ArrayList;
import java.util.List;

public class GeomProgression {
    public static int generateAndSum(int first, int denominator, int count) {
        List<Integer> list = new ArrayList<>(count);
        list.add(first);
        int summ = first;
        for (int i = 1; i < count; i++) {
            list.add(list.get(i - 1) * denominator);
            summ = summ + list.get(i);
        }
        return summ;
    }
}