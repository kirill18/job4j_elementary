package ru.job4j.array;

public class Matrix {

    public static int[][] multiple(int size) {
        int[][] matrix = new int[size][size];
        for (int row = 1; row <= size; row++) {
            for (int cell = 1; cell <= size; cell++) {
                    int temp = row * cell;
                    matrix[row - 1][cell - 1] = temp;
            }
        }
        return matrix;
    }
}
