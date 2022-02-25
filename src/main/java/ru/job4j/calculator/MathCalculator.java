package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double subtractionAndDiv(double first, double second) {
        return div(first, second)
                + subtraction(first, second);
    }

    public static double sumAll(double first, double second) {
        return div(first, second)
                + subtraction(first, second) + sum(first, second)
                + multiply(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета sumAndMultiply равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета subtractionAndDiv равен: " + subtractionAndDiv(20, 10));
        System.out.println("Результат расчета sumAll равен: " + sumAll(20, 10));
    }
}