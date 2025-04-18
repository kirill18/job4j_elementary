package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

public class PrimeNumberTest {

    @Test
    public void when30() {
        int finish = 30;
        int result = PrimeNumber.calc(finish);
        int expected = 10;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void when0() {
        int finish = 0;
        int result = PrimeNumber.calc(finish);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void when5() {
        int finish = 5;
        int result = PrimeNumber.calc(finish);
        int expected = 3;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void when11() {
        int finish = 11;
        int result = PrimeNumber.calc(finish);
        int expected = 5;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void when2() {
        int finish = 2;
        int result = PrimeNumber.calc(finish);
        int expected = 1;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void when3() {
        int finish = 3;
        int result = PrimeNumber.calc(finish);
        int expected = 2;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void when1() {
        int finish = 1;
        int result = PrimeNumber.calc(finish);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }
}