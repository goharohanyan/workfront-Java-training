package javahomework.homework1.lesson1;

import java.util.Scanner;

//     Write a program to get a number from the user and print whether it is positive or negative.

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input number: ");
        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println("Number is positive");
        } else if (number < 0) {
            System.out.println("Number is negative");
        } else {
            System.out.println("Number is 0");
        }
    }
}
