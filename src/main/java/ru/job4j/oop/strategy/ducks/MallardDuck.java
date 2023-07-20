package ru.job4j.oop.strategy.ducks;

import ru.job4j.oop.strategy.fly.FlyWithWings;
import ru.job4j.oop.strategy.quack.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        /* в конструкторе эта реализация утки инициализирует поведенческие интерфейсы
        конкретными реализациями поведения (как именно она будет летать и крякать) */
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I’m a real Mallard duck");
    }
}
