package ru.job4j.lambda;

import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class LinearFunctionTest {

    @Test
    public void whenLinearFunctionThenLinearResults() {
        List<Double> result = LinearFunction.diapason(2, 5, x -> 2 * x + 1);
        List<Double> expected = Arrays.asList(5D, 7D, 9D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenLinearFunctionThenResults() {
        List<Double> result = LinearFunction.diapason(5, 8, x -> x * x);
        List<Double> expected = Arrays.asList(25D, 36D, 49D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenLinearFunctionThenExponentialResults() {
        List<Double> result = LinearFunction.diapason(1, 4, x -> Math.pow(2, x));
        List<Double> expected = Arrays.asList(2D, 4D, 8D);
        assertThat(result, is(expected));
    }
}