package javahomework.homework2;

//    Initialize matrix with random ints in range 10 - 99 of dimensions 10x15 and print it.
//    Rotate it in 180 degree clockwise and print the rotated matrix.

import java.util.Random;

public class Task8 {

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

    public static int[][] rotateMatrix180Clockwise(int[][] matrix) {
        int[][] rotatedMatrix = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < rotatedMatrix.length; i++) {
            for (int j = 0; j < rotatedMatrix[i].length; j++) {
                rotatedMatrix[i][j] = matrix[matrix.length -1 - i][matrix[i].length - 1 - j];
            }
        }
        return rotatedMatrix;
    }

    public static void main(String[] args) {
        int[][] matrix = initializeMatrix(10, 15);
        printMatrix(matrix);
        int[][] rotatedMatrix = rotateMatrix180Clockwise(matrix);
        System.out.println();
        printMatrix(rotatedMatrix);

    }
}
