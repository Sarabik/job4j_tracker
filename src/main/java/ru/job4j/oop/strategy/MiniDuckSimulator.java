package ru.job4j.oop.strategy;

import ru.job4j.oop.strategy.ducks.Duck;
import ru.job4j.oop.strategy.ducks.MallardDuck;
import ru.job4j.oop.strategy.ducks.ModelDuck;
import ru.job4j.oop.strategy.fly.FlyRocketPowered;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
