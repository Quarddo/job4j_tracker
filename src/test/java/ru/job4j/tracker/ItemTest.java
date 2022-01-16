package ru.job4j.tracker;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class ItemTest {

    @Test
    public void whenSortedAsc() {
        List<Item> items = Arrays.asList(
                new Item(1, "one"),
                new Item(3, "three"),
                new Item(5, "five")
        );
        items.sort(new ItemAscByName());
        List<Item> expected = Arrays.asList(
                new Item(5, "five"),
                new Item(1, "one"),
                new Item(3, "three")
        );
        assertThat(items, is(expected));
    }

    @Test
    public void whenSortedDesc() {
        List<Item> items = Arrays.asList(
                new Item(1, "one"),
                new Item(3, "three"),
                new Item(5, "five")
        );
        items.sort(new ItemDescByName());
        List<Item> expected = Arrays.asList(
                new Item(3, "three"),
                new Item(1, "one"),
                new Item(5, "five")
        );
        assertThat(items, is(expected));
    }
}