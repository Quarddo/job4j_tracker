package ru.job4j.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Преобразование списка профилей, в список адресов
 */
public class Profiles {
    public static List<Address> collect(List<Profile> profiles) {
        return profiles.stream()
                .map(Profile::getAddress)
                .collect(Collectors.toList());
    }

    /**
     * Преобразовывает список профилей в список андресов(map(Profile::getAddress),
     * сортирует элементы (sorted(Comparator.comparing(Address::getCity))
     * и убирает дублирующие элементы (distinct())
     * @param profiles список профилей
     * @return возвращает отсортированный список, без повторных значений
     */
    public static List<Address> collectSortWithoutDuplicate(List<Profile> profiles) {
        return profiles.stream().map(Profile::getAddress)
                .sorted(Comparator.comparing(Address::getCity))
                .distinct()
                .collect(Collectors.toList());
    }
}
