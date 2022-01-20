package ru.job4j.collection;

import java.util.*;

public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        List<String> first = new ArrayList<>(Arrays.asList(o1.split("/")));
        List<String> second = new ArrayList<>(Arrays.asList(o2.split("/")));
        return second.get(0).compareTo(first.get(0));
    }
}
