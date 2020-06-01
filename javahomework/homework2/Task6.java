package javahomework.homework2;

//    Initialize matrix with random ints in range 10 - 99 of dimensions 10x15 and print it.
//    Get the row number from console and print the sum of the elements in that row of the matrix.

import java.util.Random;
import java.util.Scanner;

public class Task6 {

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

    public static int sumOfRow(int[][] matrix, int row) {
        int sum = 0;
        for (int i = 0; i < matrix[row].length; i++) {
            sum += matrix[row][i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] matrix = initializeMatrix(10,15);
        System.out.println("Initialized matrix : 6");
        printMatrix(matrix);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a row number :");
        int row = scanner.nextInt();
        System.out.println("Sum of elements of row : " + sumOfRow(matrix, row));

    }
}
