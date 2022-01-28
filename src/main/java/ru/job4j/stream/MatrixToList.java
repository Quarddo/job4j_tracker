package ru.job4j.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Преобразование матрицы чисел в список чисел
 */
public class MatrixToList {
    /**
     * @param matrix матрица чисел
     * flatMap - метод, который принимает элемент(matrix) потока
     *           и преобразовывает его в новый поток
     * @return возвращает преобразованный список чисел
     */
    public static List<Integer> convert(Integer[][] matrix) {
        return Stream.of(matrix)
                .flatMap(Arrays::stream)
                .collect(Collectors.toList());
    }
}
