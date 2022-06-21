package ru.job4j.bank;

import java.util.Objects;
/**
 * Класс описывает банковский счет пользователя
 * @author Lidiya
 * @version 1.0
 */
public class Account {
    /**
     * Реквизиты счета
     */
    private String requisite;
    /**
     * Баланс счета
     */
    private double balance;

    /**
     * Конструктор класса
     * @param requisite реквизиты счета
     * @param balance баланс счета
     */
    public Account(String requisite, double balance) {
        this.requisite = requisite;
        this.balance = balance;
    }

    /**
     * Геттер для реквизитов счета
     * @return возвращает реквизиты счета
     */
    public String getRequisite() {
        return requisite;
    }

    /**
     * Сеттер для реквизитов счета
     * @param requisite реквизиты счета
     */
    public void setRequisite(String requisite) {
        this.requisite = requisite;
    }

    /**
     * Геттер для баланса счета
     * @return возвращает баланс счета
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Сеттер для баланса счета
     * @param balance баланс счета
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * Переопределение метода equals.
     * @param o банковский счет пользователя
     * @return  метод возвращает true если реквизиты счета одинаковые.
     * Метод возвращает false если реквизиты счета разные.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Account account = (Account) o;
        return Objects.equals(requisite, account.requisite);
    }

    /**
     Переопределение метода hashCode.
     * @return метод возвращает hashCode.
     */
    @Override
    public int hashCode() {
        return Objects.hash(requisite);
    }
}