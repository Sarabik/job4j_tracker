package ru.job4j.collection.additional;

import java.util.List;

public class ArProgression {
    public static int checkData(List<Integer> data) {
        int rsl = 0;
        if (data.size() > 2) {
            rsl = data.get(0) + data.get(data.size() - 1);
            for (int i = 1; i < data.size() - 1; i++) {
                if (data.get(i) == (data.get(i - 1) + data.get(i + 1)) / 2) {
                    rsl = rsl + data.get(i);
                } else {
                    rsl = 0;
                    break;
                }
            }
        }
        return rsl;
    }
}