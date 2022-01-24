package ru.job4j.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class LinearFunction {
    /**
     * Метод подсчитывает функцию в диапаззоне
     * @param start начало диапазона
     * @param end конец диапазона
     * @param func вызывает метод apply(), который вызывает
     * функцию со значениями и аргументами в виде i (либо в виде массива)
     * @return возвращает результат
     */

    public static List<Double> diapason(int start, int end, Function<Double, Double> func) {
        List<Double> list = new ArrayList<>();
        for (int i = start; i < end; i++) {
            list.add(func.apply((double) i));
        }
        return list;
    }
}
