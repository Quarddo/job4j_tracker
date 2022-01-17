package ru.job4j.bank;

import java.util.Objects;

/**
 * Класс представлет модель банковского счета
 * @author Teriushov Maksim
 * @version 1.0
 */
public class Account {
    /**
     * Реквизиты счета храняться в переменной requisite
     */
    private String requisite;
    /**
     * Данные о количестве денежных средств, которые находяться на данном счете
     */
    private double balance;

    /**
     * Конструктор класса Account
     * @param requisite хранит данные о реквизитах счета
     * @param balance хранит данные о кол-ве денежных средств на счете
     */
    public Account(String requisite, double balance) {
        this.requisite = requisite;
        this.balance = balance;
    }

    /**
     * Метод предоставляет доступ к значению реквизитов счета
     * @return возвращает переменную requisite
     */
    public String getRequisite() {
        return requisite;
    }

    /**
     * Метод устанавливает значение реквизитов счета
     * @param requisite реквизиты счета
     */
    public void setRequisite(String requisite) {
        this.requisite = requisite;
    }

    /**
     * Метод предоставлет доступ к балансу счета
     * @return возвращает баланс счета
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Метод устанавливает значение денежных средств на балансе счета
     * @param balance задает значение баланса
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * Метод сравнивает объекты типа Account по значению поля requisite
     * @param o сравниваемый объект
     * @return возвращет true, если объекты равны и false, если неравны
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
     * Метод возвращает числовое значение фиксированной длины для объекта
     * @return возвращает значение requisite
     */
    @Override
    public int hashCode() {
        return Objects.hash(requisite);
    }
}