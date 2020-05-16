package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

public class FitTest {
    @Test
    public void manWeight() {
        int in = 181;
        float expected = 93.15f;
        double out = Fit.manWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }
    @Test
    public void womanWeight() {
        int in = 162;
        float expected = 59.8f;
        double out = Fit.womanWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }


}