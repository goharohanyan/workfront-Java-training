package javahomework.homework2;

//    Initialize matrix with random ints in range 10 - 99 of dimensions 10x15 and print it.
//    Find and print the maximum element.

import java.util.Random;

public class Task5 {

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

    public static int maxElement(int[][] matrix) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                max = Math.max(max, matrix[i][j]);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[][] array = initializeMatrix(10, 15);
        System.out.println("Initialized matrix : ");
        printMatrix(array);
        System.out.print("Maximum element of matrix : ");
        System.out.println(maxElement(array));
    }
}
