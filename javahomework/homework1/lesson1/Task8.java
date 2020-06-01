package javahomework.homework1.lesson1;

//    Write a program that reads a number in inches, converts it to meters.

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input a value for inch: ");
        double inches = scanner.nextDouble();
        double meters = inches * 0.0254;

        System.out.println(inches + " inch is " + meters + " meters");

    }
}
