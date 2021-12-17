package ru.job4j.oop;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void distance() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double rsl = a.distance(b);
        double expected = 2.0;
        assertThat(expected, is(rsl));
    }

    @Test
    public void distance3d() {
        Point a = new Point(6, 1, 2);
        Point b = new Point(4, 0, 4);
        double rsl = a.distance3d(b);
        double expected = 3.0;
        assertThat(expected, is(rsl));
    }
}