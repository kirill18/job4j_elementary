package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SwitchWeekTest {

    @Test
    public void whenOneThenMonday() {
        int in = 1;
        String result = SwitchWeek.nameOfDay(in);
        String expected = "Понедельник";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenTwoThenTuesday() {
        int in = 2;
        String result = SwitchWeek.nameOfDay(in);
        String expected = "Вторник";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenThreeThenWednesday() {
        int in = 3;
        String result = SwitchWeek.nameOfDay(in);
        String expected = "Среда";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenFourThenThursday() {
        int in = 4;
        String result = SwitchWeek.nameOfDay(in);
        String expected = "Четверг";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenFiveThenFriday() {
        int in = 5;
        String result = SwitchWeek.nameOfDay(in);
        String expected = "Пятница";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenSixThenSaturday() {
        int in = 6;
        String result = SwitchWeek.nameOfDay(in);
        String expected = "Суббота";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenSevenThenSunday() {
        int in = 7;
        String result = SwitchWeek.nameOfDay(in);
        String expected = "Воскресенье";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenZeroThenError() {
        int in = 0;
        String result = SwitchWeek.nameOfDay(in);
        String expected = "Ошибка";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenEightThenError() {
        int in = 8;
        String result = SwitchWeek.nameOfDay(in);
        String expected = "Ошибка";
        Assert.assertEquals(expected, result);
    }
}