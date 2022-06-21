package ru.job4j.bank;

import java.util.Objects;

/**
 * Класс описывает пользователя
 * @author Lidiya
 * @version 1.0
 */
public class User {
    /**
     * Номер паспорта пользователя
     */
    private String passport;
    /**
     * Имя пользователя
     */
    private String username;

    /**
     * Конструктор класса
     * @param passport номер паспорта
     * @param username имя пользователя
     */
    public User(String passport, String username) {
        this.passport = passport;
        this.username = username;
    }

    /**
     * Геттер для номера пасспорта
     * @return возвращает номер паспорта
     */
    public String getPassport() {
        return passport;
    }

    /**
     * Сеттер для номера паспорта
     * @param passport номер распорта
     */
    public void setPassport(String passport) {
        this.passport = passport;
    }

    /**
     * Геттер для имени пользователя
     * @return возвращает имя пользователя
     */
    public String getUsername() {
        return username;
    }

    /**
     * Сеттер для номера паспорта
     * @param username имя пользователя
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Переопределение метода equals.
     * @param o пользователь
     * @return  метод возвращает true если номера паспортов
     * пользователей одинаковые. Метод возвращает false если
     * номера паспортов пользователей разные.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return Objects.equals(passport, user.passport);
    }

    /**
     * Переопределение метода hashCode.
     * @return метод возвращает hashCode.
     */
    @Override
    public int hashCode() {
        return Objects.hash(passport);
    }
}