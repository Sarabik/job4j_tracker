package ru.job4j.poly;

public class Bus implements Transport {

    @Override
    public void go() {
        System.out.println("Автобус в пути");
    }

    @Override
    public void passengers(int count) {
        System.out.println("В автобусе " + count + "пассажиров");
    }

    @Override
    public double fill(double fuel) {
        return fuel * 57;
    }
}
