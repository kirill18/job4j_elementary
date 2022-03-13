package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MultipleSwitchWeekTest {

    @Test
    public void whenRuMondayThenOne() {
        int result = MultipleSwitchWeek.numberOfDay("Понедельник");
        int expected = 1;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenEngMondayThenOne() {
        int result = MultipleSwitchWeek.numberOfDay("Monday");
        int expected = 1;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenRuTuesdayThenTwo() {
        int result = MultipleSwitchWeek.numberOfDay("Вторник");
        int expected = 2;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenEngTuesdayThenTwo() {
        int result = MultipleSwitchWeek.numberOfDay("Tuesday");
        int expected = 2;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenRuWednesdayThenThree() {
        int result = MultipleSwitchWeek.numberOfDay("Среда");
        int expected = 3;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenEngWednesdayThenThree() {
        int result = MultipleSwitchWeek.numberOfDay("Wednesday");
        int expected = 3;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenRuThursdayThenFour() {
        int result = MultipleSwitchWeek.numberOfDay("Четверг");
        int expected = 4;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenEngThursdayThenFour() {
        int result = MultipleSwitchWeek.numberOfDay("Thursday");
        int expected = 4;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenRuFridayThenFive() {
        int result = MultipleSwitchWeek.numberOfDay("Пятница");
        int expected = 5;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenEngFridayThenFive() {
        int result = MultipleSwitchWeek.numberOfDay("Friday");
        int expected = 5;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenRuSaturdayThenSix() {
        int result = MultipleSwitchWeek.numberOfDay("Суббота");
        int expected = 6;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenEngSaturdayThenSix() {
        int result = MultipleSwitchWeek.numberOfDay("Saturday");
        int expected = 6;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenRuSundayThenSeven() {
        int result = MultipleSwitchWeek.numberOfDay("Воскресенье");
        int expected = 7;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenEngSundayThenSeven() {
        int result = MultipleSwitchWeek.numberOfDay("Sunday");
        int expected = 7;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenEngAnotherStringThenError() {
        int result = MultipleSwitchWeek.numberOfDay("Error");
        int expected = -1;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenRuAnotherStringThenError() {
        int result = MultipleSwitchWeek.numberOfDay("Ошибка");
        int expected = -1;
        Assert.assertEquals(expected, result);
    }
}