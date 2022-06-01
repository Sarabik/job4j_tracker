package ru.job4j.oop;

public class Calculator {

    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public int multiply(int a) {
        return x * a;
    }

    public static int minus(int e) {
        return e - x;
    }

    public int divide(int b) {
        return b / x;
    }

    public int sumAllOperation(int c) {
        return sum(c) + this.multiply(c) + minus(c) + this.divide(c);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int result = sum(10);
        System.out.println(result);
        result = calculator.multiply(5);
        System.out.println(result);
        result = minus(13);
        System.out.println(result);
        result = calculator.divide(17);
        System.out.println(result);
        result = calculator.sumAllOperation(4);
        System.out.println(result);

    }
}