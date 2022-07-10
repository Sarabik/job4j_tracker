package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Класс представляет набор операций с данными и счетом пользователя
 * @author Lidiya
 * @version 1.0
 */
public class BankService {
    /**
     * Хранение информации о пользователе и его банковском счете осуществляется
     * в коллекции типа HashMap
     */
    private final Map<User, List<Account>> users = new HashMap<>();

    /**
     * Добавление информации о новом пользователе и создание списка его счетов
     * @param user пользователь
     */
    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<Account>());
    }

    /**
     * Добавление нового счета в список счетов пользователя
     * @param passport номер паспорта пользователя
     * @param account новый счет, который нужно добавить
     */
    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> accounts = users.get(user);
            if (!accounts.contains(account)) {
                accounts.add(account);
            }
        }
    }

    /**
     * Поиск пользователя по его номеру паспорта
     * @param passport номер паспорта пользователя
     * @return метод возвращает пользователя либо null (если он не найден)
     */
    public User findByPassport(String passport) {
        return users.keySet()
                .stream()
                .filter(user -> passport.equals(user.getPassport()))
                .findFirst()
                .orElse(null);
    }

    /**
     * Поиск счета пользователя по реквизитам
     * @param passport номер паспорта пользователя
     * @param requisite реквизиты счета
     * @return метод возвращает счет либо null (если счет с такими реквизитами не найден)
     */
    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        if (user != null) {
            return users.get(user)
                    .stream()
                    .filter(account -> requisite.equals(account.getRequisite()))
                    .findFirst()
                    .orElse(null);
        }
        return null;
    }

    /**
     * Перечисление указанной денежной суммы с одного счета на другой
     * @param srcPassport номер паспорта пользователя, со счета которого необходимо снять деньги
     * @param srcRequisite реквизиты счета, с которого необходимо снять деньги
     * @param destPassport номер паспорта пользователя, на счет которого необходимо перевести деньги
     * @param destRequisite реквизиты счета, на который необходимо перевести деньги
     * @param amount денежная сумма перевода
     * @return метод возвращает true если операция прошла успешно и false если операция прошла неудачно
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Account srcAccount = findByRequisite(srcPassport, srcRequisite);
        Account destAccount = findByRequisite(destPassport, destRequisite);
        if (srcAccount != null && destAccount != null && srcAccount.getBalance() >= amount) {
            srcAccount.setBalance(srcAccount.getBalance() - amount);
            destAccount.setBalance(destAccount.getBalance() + amount);
            rsl = true;
        }
        return rsl;
    }
}