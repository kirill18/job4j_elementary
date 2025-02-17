package ru.job4j.calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;

class FitTest {

    @Test
    void whenManHeight187ThenWeight100dot05() {
        short height = 187;
        double expected = 100.05;
        double actual = Fit.manWeight(height);
        assertEquals(expected, actual, 0.01);
    }

    @Test
    void whenManHeight170ThenWeight80dot5() {
        short height = 170;
        double expected = 80.5;
        double actual = Fit.manWeight(height);
        assertThat(actual).isCloseTo(expected, within(0.01));
    }

    @Test
    void whenWomanHeight167ThenWeight65dot55() {
        short height = 167;
        double expected = 65.55;
        double actual = Fit.womanWeight(height);
        assertEquals(expected, actual, 0.01);
    }

    @Test
    void whenWomanHeight155ThenWeight51dot75() {
        short height = 155;
        double expected = 51.75;
        double actual = Fit.womanWeight(height);
        assertThat(actual).isCloseTo(expected, within(0.01));
    }
}