package javahomework.homework1.lesson1;

//    Write a program that takes two numbers as input from console and display the product of two numbers.

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input first number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Input second number: ");
        int secondNumber = scanner.nextInt();

        System.out.println(firstNumber + " * " + secondNumber + " = " + firstNumber * secondNumber);

    }
}
