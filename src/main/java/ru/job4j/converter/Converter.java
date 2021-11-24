package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        return value / 70;

    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        float dollar = Converter.rubleToDollar(140);
        System.out.println("140 rubles are " + dollar + " dollar.");

        float in = 140;
        float expectedEur = 2;
        float expectedUsd = 2.3333333f;
        float outEur = Converter.rubleToEuro(in);
        float outUsd = Converter.rubleToDollar(in);
        boolean passedEur = expectedEur == outEur;
        boolean passedUsd = expectedUsd == outUsd;
        System.out.println("140 rubles are 2 Eur. Test result : " + passedEur + "\n" + "140 rubles are 2 Usd. Test result : " + passedUsd);
    }
}
