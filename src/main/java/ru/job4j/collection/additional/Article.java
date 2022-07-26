package ru.job4j.collection.additional;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Article {
    public static boolean generateBy(String origin, String line) {
        StringBuilder sourceClear = new StringBuilder();
        for (char l : origin.toCharArray()) {
            if (Character.isLetter(l) || Character.isSpaceChar(l)) {
                sourceClear.append(l);
            }
        }
        Set<String> sourceText = new HashSet<>(Arrays.asList(sourceClear.toString().split(" ")));

        StringBuilder newClear = new StringBuilder();
        for (char l : line.toCharArray()) {
            if (Character.isLetter(l) || Character.isSpaceChar(l)) {
                newClear.append(l);
            }
        }
        Set<String> newText = new HashSet<>(Arrays.asList(newClear.toString().split(" ")));
        for (String str : newText) {
            if (!sourceText.contains(str)) {
                return false;
            }
        }
        return true;
    }
}
