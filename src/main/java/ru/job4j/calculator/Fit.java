package ru.job4j.calculator;

import java.util.Scanner;

public class Fit {

    private static final double COEFFICIENT = 1.15;
    private static final int MAN_OFFSET = 100;
    private static final int WOMAN_OFFSET = 110;

    public static double manWeight(final short height) {
        return (height - MAN_OFFSET) * COEFFICIENT;
    }

    public static double womanWeight(final short height) {
        return (height - WOMAN_OFFSET) * COEFFICIENT;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите рост мужчины (см): ");
        short manHeight = scanner.nextShort();
        double manWeight = manWeight(manHeight);
        System.out.println("Идеальный вес мужчины при росте " + manHeight + " см: " + String.format("%.2f", manWeight) + " кг");

        System.out.print("Введите рост женщины (см): ");
        short womanHeight = scanner.nextShort();
        double womanWeight = womanWeight(womanHeight);
        System.out.println("Идеальный вес женщины при росте " + womanHeight + " см: " + String.format("%.2f", womanWeight) + " кг");

        scanner.close();
    }
}