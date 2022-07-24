package ru.job4j.collection.additional;

public class Parentheses {
    public static boolean valid(char[] data) {
        int check = 0;
        for (char elem : data) {
            if (elem == '(') {
                check++;
            } else if (elem == ')') {
                check--;
            }
            if (check < 0) {
                return false;
            }
        }
        return check == 0;
    }
}
