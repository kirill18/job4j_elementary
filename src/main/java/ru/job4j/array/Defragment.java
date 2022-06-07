package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == null) {
                String temp = array[index];
                for (int i = 0; i < array.length; i++) {
                    if (array[i] != null && index < i) {
                        array[index] = array[i];
                        array[i] = temp;
                        break;
                    }
                }
            }
        }
        return array;
    }
}