package ru.job4j.oop.strategy.ducks;

import ru.job4j.oop.strategy.fly.FlyBehavior;
import ru.job4j.oop.strategy.quack.QuackBehavior;

public abstract class Duck {
    /* поля с экземплярами поведенческих интерфейсов */
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck() {
    }

    /* сеттеры для поведенческих полей */
    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }

    /* метод с индивидуальной реализацией для любого подкласса делаем абстрактным */
    public abstract void display();

    /* методы которые вызывают методы экземпляров поведенческих интерфейсов */
    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    /* метод реализация которого одинаковая для всех подклассов */
    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }
}
