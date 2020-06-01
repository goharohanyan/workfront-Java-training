package javahomework.homework1.lesson1;

//    Write a  program that takes a number as input and prints its multiplication table upto 10.

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input a number: ");
        int inputNumber = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(inputNumber + " * " + i + " = " + inputNumber * i);
        }
    }
}
