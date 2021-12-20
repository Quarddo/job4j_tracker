package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item[] findAll() {
        Item[] rsl = new Item[size];
        Item[] rst = new Item[rsl.length];
        for (int i = 0; i < rsl.length; i++) {
            Item item = items[i];
            if (item.getName() != null) {
                rst[i] = item;
                size++;
            }
        }
        rst = Arrays.copyOf(rst, size);
        return rst;
    }

    public Item[] findByName(String key) {
        Item[] rsl = new Item[size];
        Item[] rst = new Item[rsl.length];
        for (int i = 0; i < rsl.length; i++) {
            Item item = items[i];
            if (item.getName() == key) {
                rst[i] = item;
                size++;
            }
        }
        rst = Arrays.copyOf(rst, size);
        return rst;
    }

    public Item findById(int id) {
        Item rsl = null;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getId() == id) {
                rsl = item;
                break;
            }
        }
        return rsl;
    }
}