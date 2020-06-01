package javahomework.homework3.lesson5;

//    Write function (takes a number N as input from console) that creates N x N matrix. Initializes it with random numbers in range 27 - 78.

import java.util.Random;
import java.util.Scanner;

public class Task19 {

    public static int[][] initializeInGivenRange(int[][] matrix, int lower, int upper){
        Random random = new Random();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(upper - lower + 1) + lower;
            }
        }
        return  matrix;
    }

    public static int[][] allocateEmptyMatrix(int size){
        return new int[size][size];
    }

    public static void printMatrix(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] rotateMatrix90(int[][] matrix) {
        int[][] rotatedMatrix = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < rotatedMatrix.length; i++) {
            for (int j = 0; j < rotatedMatrix[i].length; j++) {
                rotatedMatrix[i][j] = matrix[matrix.length - 1 - j][i];
            }
        }
        return rotatedMatrix;
    }

    public static int[][] rotateMatrix180(int[][] matrix) {
        int[][] rotatedMatrix = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < rotatedMatrix.length; i++) {
            for (int j = 0; j < rotatedMatrix[i].length; j++) {
                rotatedMatrix[i][j] = matrix[matrix.length -1 - i][matrix[i].length - 1 - j];
            }
        }
        return rotatedMatrix;
    }

    public static int[][] rotateMatrix270(int[][] matrix) {
        int[][] rotatedArray = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < rotatedArray.length; i++) {
            for (int j = 0; j < rotatedArray[i].length; j++) {
                rotatedArray[i][j] = matrix[j][matrix[j].length - 1 - i];
            }
        }
        return rotatedArray;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter matrix size : ");
        int size = scanner.nextInt();
        int[][] matrix = allocateEmptyMatrix(size);
        initializeInGivenRange(matrix, 27, 78);
        System.out.println("Initialized matrix : ");
        printMatrix(matrix);
        System.out.println("90* rotated matrix : ");
        printMatrix(rotateMatrix90(matrix));
        System.out.println("180* rotated matrix : ");
        printMatrix(rotateMatrix180(matrix));
        System.out.println("270* rotated matrix : ");
        printMatrix(rotateMatrix270(matrix));


    }
}
