package ru.job4j.bank;

import java.util.Objects;

/**
 * Данные пользователя
 * @author Teriushov Maksim
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
     * Конструктор класса User
     * @param passport хранит данные о паспорте
     * @param username хранит данные о имени пользователя
     */
    public User(String passport, String username) {
        this.passport = passport;
        this.username = username;
    }

    /**
     * Метод предоставляет доступ к данным о паспорте
     * @return возвращает переменную passport
     */
    public String getPassport() {
        return passport;
    }

    /**
     * Метод устанавливает данные о паспорте
     * @param passport задает значение паспорта
     */
    public void setPassport(String passport) {
        this.passport = passport;
    }

    /**
     * Метод предоставляет доступ к имени пользователя
     * @return возвращает переменную username
     */
    public String getUsername() {
        return username;
    }

    /**
     * Метод устанавливает имя пользователя
     * @param username задает значение имени пользователя
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Метод сравнивает объекты типа User по значению поля passport
     * @param o сравниваемый объект
     * @return возвращает true, если объекты равны и false, если не равны
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
     * Метод возвращает числовое значение фиксированной длины для объекта
     * @return возвращает значение passport
     */
    @Override
    public int hashCode() {
        return Objects.hash(passport);
    }
}