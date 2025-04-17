package ru.job4j.array;

public class SimpleStringEncoder {
    public static String encode(String input) {
        String result = "";
        int counter = 1;
        for (int i = 0; i < input.length() - 1; i++) {
            if (input.charAt(i) == input.charAt(i + 1)) {
                counter++;
            } else {
                if (counter > 1) {
                    result = (result + input.charAt(i)) + counter;
                } else {
                    result = (result + input.charAt(i));
                }
                counter = 1;
            }
        }
        if (counter > 1) {
            result = (result + input.charAt(input.length() - 1)) + counter;
        } else {
            result = result + input.charAt(input.length() - 1);
        }
        return result;
    }
}