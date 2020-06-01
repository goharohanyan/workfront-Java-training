package javahomework.homework3.lesson5;

//    Write function (takes a number n as input from console) to displays a square matrix initialized randomly by ‘+’ or ‘-’

import java.util.Random;
import java.util.Scanner;

public class Task18 {

    public static char[][] initializeMatrixRandomlyWithSymbols(char[][] matrix, char symbol1, char symbol2) {
        Random random = new Random();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (random.nextInt(2) == 0) {
                    matrix[i][j] = symbol1;
                } else {
                    matrix[i][j] = symbol2;

                }
            }
        }
        return matrix;
    }

    public static char[][] allocateEmptySquareMatrix(int size) {
        return new char[size][size];
    }

    public static void printMatrix(char[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of matrix : ");
        int size = scanner.nextInt();
        char[][] matrix = allocateEmptySquareMatrix(size);
        printMatrix(initializeMatrixRandomlyWithSymbols(matrix, '+', '-'));
    }
}
