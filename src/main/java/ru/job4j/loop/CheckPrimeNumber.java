package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = true;
        for (int n = 2; n < number - 1; n++) {
            if (number % n == 0) {
            prime = false;
            break;
            }
        }
        if (number == 1 || number == 0) {
            prime = false;
        }
        return prime;
    }
}