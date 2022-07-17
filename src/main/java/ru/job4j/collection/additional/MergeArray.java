package ru.job4j.collection.additional;

import java.util.Iterator;
import java.util.List;
import java.util.stream.IntStream;

public class MergeArray {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        if (left.length == 0) {
            return right;
        }
        if (right.length == 0) {
            return left;
        }
        List<Integer> leftList = IntStream.of(left).boxed().toList();
        Iterator<Integer> iterLeft = leftList.iterator();

        List<Integer> rightList = IntStream.of(right).boxed().toList();
        Iterator<Integer> iterRight = rightList.iterator();

        int leftNumber = iterLeft.next();
        int rightNumber = iterRight.next();

        for (int i = 0; i < rsl.length; i++) {
            rsl[i] = Math.min(leftNumber, rightNumber);
            if (leftNumber == rsl[i]) {
                if (!iterLeft.hasNext()) {
                    leftNumber = right[right.length - 1] + 1;
                } else {
                    leftNumber = iterLeft.next();
                }
            } else if (rightNumber == rsl[i]) {
                if (!iterRight.hasNext()) {
                    rightNumber = left[left.length - 1] + 1;
                } else {
                    rightNumber = iterRight.next();
                }
            }
        }
        return rsl;
    }
}
