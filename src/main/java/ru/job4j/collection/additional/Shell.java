package ru.job4j.collection.additional;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.StringJoiner;

public class Shell {

    LinkedList<String> pathList = new LinkedList<>();

    public void cd(String path) {
        if (path.startsWith("/")) {
            pathList.clear();
            pathList.addAll(Arrays.asList(path.substring(1).split("/")));
        } else if (path.startsWith("..")) {
            pathList.removeLast();
            if (path.length() > 2) {
                pathList.addAll(Arrays.asList(path.substring(3).split("/")));
            }
        } else {
            pathList.addAll(Arrays.asList(path.split("/")));
        }
    }

    public String pwd() {
        StringJoiner joiner = new StringJoiner("/");
        for (String str : pathList) {
            joiner.add(str);
        }
        return "/" + joiner.toString();
    }
}
