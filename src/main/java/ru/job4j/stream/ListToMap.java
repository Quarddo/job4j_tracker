package ru.job4j.stream;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Преобразование списка(List) в карту(Map)
 */
public class ListToMap {
    /**
     *
     * @param list проход по списку студентов
     * Student::getSurname - ключ(фамилия студента)
     * s -> s - значение (объект ученика)
     * (s, s1) -> s -  ключ - это фамилия, то дубликатами будут те пары,
     * у которых совпадают фамилии студентов. В случае добавления
     * дубликата необходимо оставить старое значение.
     * @return возвращает карту (с фамилией и значением)
     */
    public static Map<String, Student> convert(List<Student> list) {
        return list.stream().collect(Collectors.toMap(
                Student::getSurname,
                s -> s,
                (s, s1) -> s
        ));
    }
}