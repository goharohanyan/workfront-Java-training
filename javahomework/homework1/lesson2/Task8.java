package javahomework.homework1.lesson2;

//    We have a circle with radius 5. Display a menu in console:
//            ------------MENU-----------
//            ---> enter 1 for calculating area of the circle
//            ---> enter 2 for calculating perimeter of the circle
//            ---> enter 3 for exit.

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        int radius = 5;
        System.out.println("Radius of the circle is :" + radius);
        System.out.println("------------MENU-----------");
        System.out.println("---> enter 1 for calculating area of the circle");
        System.out.println("---> enter 2 for calculating perimeter of the circle");
        System.out.println("---> enter 3 for exit.");
        Scanner scanner = new Scanner(System.in);
        int inputtedNumber = scanner.nextInt();
        while (inputtedNumber != 3){
            if (inputtedNumber == 1){
                System.out.println("Area of the circle is: " + Math.PI * radius * radius);
            }
            if (inputtedNumber == 2) {
                System.out.println("Perimeter of the circle is: " + 2 * Math.PI * radius);
            }
            System.out.println("------------MENU-----------");
            System.out.println("---> enter 1 for calculating area of the circle");
            System.out.println("---> enter 2 for calculating perimeter of the circle");
            System.out.println("---> enter 3 for exit.");
            inputtedNumber = scanner.nextInt();
        }

    }
}
