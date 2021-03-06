package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void distanceTest() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 5;
        int y2 = 2;
        double expected = 5.38;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

}