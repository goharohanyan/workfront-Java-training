package javahomework.homework3.lesson5;

//    Display a menu
//  ------------------MENU---------------
//      Press 1 -  to print “Hello Word”
//      Press 2 -  to print “Hello Vorld”
//      Press 3 -  to print “Hello Uorld”
//      Press 4 -  EXIT
//  -------------------------------------
//    After each operation program it should show the menu. DO not exit the progrm if the input is not 4.

import java.util.Scanner;

public class Task20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("------------------MENU---------------");
        System.out.println("    Press 1 -  to print 'Hello Word'");
        System.out.println("    Press 2 -  to print 'Hello Vorld'");
        System.out.println("    Press 3 -  to print 'Hello Uorld'");
        System.out.println("    Press 4 -  EXIT");
        System.out.println("-------------------------------------");
        int inputtedNumber = scanner.nextInt();
        while (inputtedNumber != 4){
            switch (inputtedNumber){
                case 1 :
                    System.out.println("Hello Word");
                    break;
                case 2 :
                    System.out.println("Hello Vorld");
                    break;
                case 3 :
                    System.out.println("Hello Uorld");
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
            inputtedNumber = scanner.nextInt();
        }
    }
}
