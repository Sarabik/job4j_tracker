package ru.job4j.collection.additional;

import java.util.ArrayList;
import java.util.List;

public class SubList {
    public static List<String> getElementsBetweenIndexes(List<String> list, String el) {
        return list.contains(el) ? list.subList(list.indexOf(el), list.lastIndexOf(el)) : new ArrayList<>();
    }
}