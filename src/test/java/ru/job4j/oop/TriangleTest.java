package ru.job4j.oop;

import static org.hamcrest.Matchers.closeTo;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class TriangleTest {

    @Test
    public void when00and40and04Then8() {
        Point a = new Point(0, 0);
        Point b = new Point(4, 0);
        Point c = new Point(0, 4);
        Triangle triangle = new Triangle(a, b, c);
        double rsl = triangle.area();
        assertThat(rsl, closeTo(8, 0.001));
    }

    @Test
    public void when24and21and2M3ThenM1() {
        Point a = new Point(2, 4);
        Point b = new Point(2, 1);
        Point c = new Point(2, -3);
        Triangle triangle = new Triangle(a, b, c);
        double rsl = triangle.area();
        assertThat(rsl, closeTo(-1, 0.001));
    }

    @Test
    public void whenM33andM3M3and2M3Then15() {
        Point a = new Point(-3, 3);
        Point b = new Point(-3, -3);
        Point c = new Point(2, -3);
        Triangle triangle = new Triangle(a, b, c);
        double rsl = triangle.area();
        assertThat(rsl, closeTo(15, 0.001));
    }
}