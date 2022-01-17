package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Класс реализует управление данными пользователей и работу перевода денежных средств
 * @author Teriushov Maksim
 * @version 1.0
 */
public class BankService {
    /**
     * Поле содержащие всех пользователей и их счета
     * реализовано в коллекции типа HashMap
     */
    public final Map<User, List<Account>> users = new HashMap<>();

    /**
     * Метод добавляет пользователя при условии,
     * что данный пользователь еще не добавлен (при помощи putIfAbsent())
     * @param user пользователь, которго добавляем в систему
     */
    public void addUser(User user) {
            users.putIfAbsent(user, new ArrayList<>());
    }

    /**
     * Метод удаляет пользователя
     * @param user пользователь, которого нужно удалить
     */
    public void removeUser(User user) {
        users.remove(user);
    }

    /**
     * Метод находит пользователя по паспорту, добавляет новый
     * аккаунт(счет) к пользователю и проверяет что у пользователя еще нет счета
     * @param passport номер паспорта пользователя
     * @param account аккаунт(счет), который необходимо добавить пользователю
     */
    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if ((user != null) && !users.get(user).contains(account)) {
            users.get(user).add(account);
        }
    }

    /**
     * Метод ищет пользователя по номеру паспорта
     * @param passport номер паспорта пользователя
     * @return возвращает пользователя если найден, в противном случае null
     */
    public User findByPassport(String passport) {
        for (User user : users.keySet()) {
            if (user.getPassport().equals(passport)) {
                return user;
            }
        }
        return null;
    }

    /**
     * Метод ищет пользователя по паспорту и если он найдет,
     * то ищет реквезиты данного пользователя
     * @param passport номер паспорта пользователя
     * @param requisite реквезиты аккаунта(счета)
     * @return возвращает аккаунт(счет), если аккаунт с указанными
     * реквезитами есть и null если таких реквезитов нет
     */
    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        if (user != null) {
            for (Account account : users.get(user)) {
                if (account.getRequisite().equals(requisite)) {
                    return account;
                }
            }
        }
        return null;
    }

    /**
     * Метод переводит денежные средства с одного счета на другой
     * уменьшая баланс переводящего счета (src) и увеличивая баланс
     * принимающего (dest)
     * @param srcPassport номер паспорта пользователя со счета которого нужно перевести средства
     * @param srcRequisite реквезиты счета с которого нужно перевести средства
     * @param destPassport номер паспорта пользователя который принимает на счет средства
     * @param destRequisite реквезиты счета на который поступаю средства
     * @param amount сумма перевода
     * @return возвращает true если перевод осуществится и false если реквезиты и пользователь не найдены
     * или на балансе "src" не достаточно денежных средств
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite,
                                 double amount) {
        Account src = findByRequisite(srcPassport, srcRequisite);
        Account dest = findByRequisite(destPassport, destRequisite);
        if (src != null && dest != null && src.getBalance() >= amount) {
            src.setBalance(src.getBalance() - amount);
            dest.setBalance(dest.getBalance() + amount);
            return true;
        }
        return false;
    }
}
