package javahomework.homework2;

//    Initialize matrix with random ints in range 10 - 99 of dimensions 5x5 and print it.
//    Display a menu:
//            ———————-MENU—————-
//            1. For rotating 90 degree
//            2. For rotating 180 degree
//            3. For rotating 270 degree
//            4. For Exit
//            ——----——————————————
//            In any other case than 4 program should NOT stop !!!

import java.util.Random;
import java.util.Scanner;

public class Task10 {

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



    public static void main(String[] args) {
        int[][] squareMatrix = initializeMatrix(5, 5);
        System.out.println("Initialized matrix :");
        printMatrix(squareMatrix);
        System.out.println("———————-MENU—————-");
        System.out.println("1. For rotating 90 degree");
        System.out.println("2. For rotating 180 degree");
        System.out.println("3. For rotating 270 degree");
        System.out.println("4. For Exit");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int inputtedNumber = scanner.nextInt();
        while (inputtedNumber != 4){
            switch (inputtedNumber){
                case 1:
                    printMatrix(Task7.matrixTranspose(squareMatrix));
                    System.out.println();
                    break;
                case 2:
                    printMatrix(Task8.rotateMatrix180Clockwise(squareMatrix));
                    System.out.println();
                    break;
                case 3:
                    printMatrix(Task9.rotateMatrix270Clockwise(squareMatrix));
                    System.out.println();
                    break;
            }
            System.out.println("———————-MENU—————-");
            System.out.println("1. For rotating 90 degree");
            System.out.println("2. For rotating 180 degree");
            System.out.println("3. For rotating 270 degree");
            System.out.println("4. For Exit");
            System.out.print("Enter a number : ");
            inputtedNumber = scanner.nextInt();
        }

    }
}
