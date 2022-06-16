package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest  {
    @Test
    public void when00to20then2() {
        double expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when10to03then3dot16() {
        double expected = 3.16;
        Point a = new Point(1, 0);
        Point b = new Point(0, 3);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when05to00then5() {
        double expected = 5;
        Point a = new Point(0, 5);
        Point b = new Point(0, 0);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}