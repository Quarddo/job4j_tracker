package ru.job4j.ex;

import java.lang.IllegalArgumentException;

public class Fact {
    public static void main(String[] args) {
        new Fact().calc(2);

    }

    public int calc(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Введены некорректные параметры.");
        }
        int rsl = 1;
        for (int index = 1; index <= n; index++) {
            rsl *= index;
        }
        return rsl;
    }
}
