package ru.job4j.collection;

import java.util.HashMap;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> hash = new HashMap<>();
        hash.put("qq@mail.ru", "Teriushov Maksim");
        for (String key : hash.keySet()) {
            String value = hash.get(key);
            System.out.println('\"' + key + '\"' + " - " + value );
        }
    }
}
