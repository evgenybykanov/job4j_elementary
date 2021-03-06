package ru.job4j;

import org.junit.Test;
import ru.job4j.condition.Point;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class PointTest {


    @Test
    public void distance() {
        Point a = new Point (5,4,9);
        Point b = new Point (2,8,5);
        double result = a.distance(b);
        assertThat(result, is(5.0));


    }
    @Test
    public void distance3d() {
        Point a = new Point (5,4,9);
        Point b = new Point (2,8,5);
        Point c = new Point (5,8,5);
        double result = a.distance3d(b);
        assertEquals(result, 4.47, 0.01);

    }
}



