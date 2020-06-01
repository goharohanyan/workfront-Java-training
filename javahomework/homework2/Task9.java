package javahomework.homework2;

//    Initialize matrix with random ints in range 10 - 99 of dimensions 10x15 and print it.
//    Rotate it in 270 degree clockwise and print the rotated matrix.

import java.util.Random;

public class Task9 {

    public static int[][] initializeMatrix(int rows, int columns) {
        Random random = new Random();
        int[][] initializedArray = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                initializedArray[i][j] = random.nextInt(90) + 10;
            }
        }
        return initializedArray;
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] rotateMatrix270Clockwise(int[][] matrix) {
        int[][] rotatedArray = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < rotatedArray.length; i++) {
            for (int j = 0; j < rotatedArray[i].length; j++) {
                rotatedArray[i][j] = matrix[j][matrix[j].length - 1 - i];
            }
        }
        return rotatedArray;
    }

    public static void main(String[] args) {
        int[][] matrix = initializeMatrix(10, 15);
        System.out.println("Initialized matrix :");
        printMatrix(matrix);
        System.out.println("Rotated matrix :");
        printMatrix(rotateMatrix270Clockwise(matrix));

    }
}
