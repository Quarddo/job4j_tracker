package ru.job4j.bank;

import java.util.*;
import java.util.Optional;
import java.util.stream.Stream;

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
        Optional<User> user = findByPassport(passport);
            if ((user.isPresent()) && !users.get(user.get()).contains(account)) {
                users.get(user.get()).add(account);
            }
    }

    /**
     * Метод ищет пользователя по номеру паспорта
     * @param passport номер паспорта пользователя
     * @return возвращает пользователя если найден, в противном случае null
     */
    public Optional<User> findByPassport(String passport) {
        Optional<User> rsl = Optional.empty();
        return users.keySet()
                .stream()
                .filter(user -> user.getPassport().equals(passport))
                .findFirst();
    }

    /**
     * Метод ищет пользователя по паспорту и если он найдет,
     * то ищет реквезиты данного пользователя
     * @param passport номер паспорта пользователя
     * @param requisite реквезиты аккаунта(счета)
     * @return возвращает аккаунт(счет), если аккаунт с указанными
     * реквезитами есть и null если таких реквезитов нет
     */
    public Optional<Account> findByRequisite(String passport, String requisite) {
        Optional<User> user = findByPassport(passport);
        if (user.isPresent()) {
            return users.get(user.get())
                    .stream()
                    .filter(r -> r.getRequisite().equals(requisite))
                    .findFirst();
        }
        return Optional.empty();
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
        Optional<Account> src = findByRequisite(srcPassport, srcRequisite);
        Optional<Account> dest = findByRequisite(destPassport, destRequisite);
        if (src.isPresent() && dest.isPresent() && src.get().getBalance() >= amount) {
            src.get().setBalance(src.get().getBalance() - amount);
            dest.get().setBalance(dest.get().getBalance() + amount);
            return true;
        }
        return false;
    }
}
