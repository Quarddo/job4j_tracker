package ru.job4j.ex;

import org.junit.Test;

import static org.junit.Assert.*;

public class FactTest {

    @Test(expected = IllegalArgumentException.class)
    public void whenMinus1() {
        Fact fact = new Fact();
        int rsl = fact.calc(-3);
    }
}