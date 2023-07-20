package ru.job4j.oop.strategy.ducks;

import ru.job4j.oop.strategy.fly.FlyNoWay;
import ru.job4j.oop.strategy.quack.Quack;

public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I’m a model duck");
    }
}
