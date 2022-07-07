package ru.job4j.collection.additional;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Firewall {
    public static String checkName(String s, Set<String> words) {
        Set<String> articleWords = new HashSet<>(Arrays.asList(s.split(" ")));
        int startSize = articleWords.size();
        articleWords.addAll(words);
        int finishSize = articleWords.size();
        return finishSize - startSize == words.size()
                ? "Вы сделали правильный выбор!" : "Выберите другую статью...";
    }
}