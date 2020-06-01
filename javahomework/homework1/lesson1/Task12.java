package javahomework.homework1.lesson1;

//    Write a program to check whether number is even or odd.

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input number: ");
        int inputNumber = scanner.nextInt();
        if (inputNumber % 2 == 0){
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}
