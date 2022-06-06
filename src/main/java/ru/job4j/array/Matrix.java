package ru.job4j.array;

public class Matrix {

    public static int[][] multiple(int size) {
        int[][] matrix = new int[size][size];
        for (int row = 1; row <= matrix.length; row++) {
            for (int cell = 1; cell <= matrix.length; cell++) {
                    int temp = row * cell;
                    matrix[row - 1][cell - 1] = temp;
            }
        }
        return matrix;
    }
}
