package javahomework.homework3.lesson5;

//    Display a menu like this
//      ---------- MENU ----------
//      Press 1 For rotating 90*
//      Press 2 For rotating 180*
//      Press 3 For rotating 270*
//      Press 4 to Exit
//      --------------------------
//    After each operation program it should show the menu. DO not exit the progrm if the input is not 4.

import java.util.Scanner;

import static javahomework.homework3.lesson5.Task19.*;

public class Task21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[][] matrix = initializeInGivenRange(allocateEmptyMatrix(size), 27, 78);
        printMatrix(matrix);
        System.out.println("---------- MENU ----------");
        System.out.println("Press 1 For rotating 90*");
        System.out.println("Press 2 For rotating 180*");
        System.out.println("Press 3 For rotating 270*");
        System.out.println("Press 4 to Exit");
        System.out.println("--------------------------");
        int commandNumber = scanner.nextInt();
        while (commandNumber != 4 ){
            switch (commandNumber){
                case 1 :
                    printMatrix(rotateMatrix90(matrix));
                    break;
                case 2 :
                    printMatrix(rotateMatrix180(matrix));
                    break;
                case 3 :
                    printMatrix(rotateMatrix270(matrix));
                    break;
                default:
                    System.out.println("Input number in range 1 - 4");
            }
            System.out.println("------------------MENU---------------");
            System.out.println("    Press 1 -  to print 'Hello Word'");
            System.out.println("    Press 2 -  to print 'Hello Vorld'");
            System.out.println("    Press 3 -  to print 'Hello Uorld'");
            System.out.println("    Press 4 -  EXIT");
            System.out.println("-------------------------------------");
            commandNumber = scanner.nextInt();
        }

    }
}
