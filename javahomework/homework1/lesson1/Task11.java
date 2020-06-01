package javahomework.homework1.lesson1;

//    Write a program to input 5 numbers from the keyboard and find their sum and average.

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            int currentNumber = scanner.nextInt();
            sum += currentNumber;
        }
        double average = (double) sum / 5;

        System.out.println("The sum of 5 numbers is: " + sum);
        System.out.println("The average is: " + average);
    }
}
