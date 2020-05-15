package ru.job4j.converter;

import org.junit.Assert;
import org.junit.Test;
import junit.framework.TestCase;

public class ConverterTest {

    @Test
    public void whenConvert140RubleThen2Euro() {
        int in = 140;
        int expected = 2;
        int out = Converter.rubleToEuro(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenConvert140RubleToDollar() {
        int in = 140;
        float expected = 2.3333333f;
        float out = Converter.rubleToDollar(in);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenConvert5DollarTo4Euro() {
        int in = 5;
        float expected = 4.6296296f;
        float out = Converter.dollarToEuro(in);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenConvert5EuroThen5Dollar() {
        int in = 5;
        float expected = 5.4347825f;
        float out = Converter.euroToDollar(in);
        Assert.assertEquals(expected, out, 0.01);
    }
}
