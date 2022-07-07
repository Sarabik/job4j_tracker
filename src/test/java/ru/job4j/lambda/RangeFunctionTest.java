package ru.job4j.lambda;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class RangeFunctionTest {

    @Test
    public void whenLinearFunctionThenLinearResults() {
        List<Double> result = RangeFunction.diapason(5, 8, x -> 2 * x + 1);
        List<Double> expected = Arrays.asList(11D, 13D, 15D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenQuadraticFunctionThenQuadraticResults() {
        List<Double> result = RangeFunction.diapason(2, 4, x -> x * x - 3 * x + 1);
        List<Double> expected = Arrays.asList(-1D, 1D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenExponentialFunctionThenExponentialResults() {
        List<Double> result = RangeFunction.diapason(2, 5, x -> Math.pow(2, x) - 3);
        List<Double> expected = Arrays.asList(1D, 5D, 13D);
        assertThat(result, is(expected));
    }
}