package javahomework.homework2;

//    Initialize matrix with random ints in range 10 - 99 of dimensions 10x15 and print it.
//    Rotate it in 90 degree clockwise and print the rotated matrix.

import java.util.Random;

public class Task7 {

    public static int[][] initializeMatrix(int rows, int columns) {
        int[][] initializedMatrix = new int[rows][columns];
        Random random = new Random();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                initializedMatrix[i][j] = random.nextInt(90) + 10;
            }
        }
        return initializedMatrix;
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] matrixTranspose(int[][] matrix) {
        int[][] rotatedMatrix = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < rotatedMatrix.length; i++) {
            for (int j = 0; j < rotatedMatrix[i].length; j++) {
                rotatedMatrix[i][j] = matrix[matrix.length - 1 - j][i];
            }
        }
        return rotatedMatrix;
    }

    public static void main(String[] args) {
        int[][] matrix = initializeMatrix(10, 15);
        System.out.println("Initialized matrix :");
        printMatrix(matrix);
        int[][] rotatedMatrix = matrixTranspose(matrix);
        System.out.println("Transposed matrix :");
        printMatrix(rotatedMatrix);
    }
}
