package javahomework.homework3.lesson5;

//    Get 2 numers from console and write a function to calculate their product. Print the product.

import java.util.Scanner;

public class Task2 {

    public static double calculateProductOfTwoInputtedNumbers(double number1, double number2) {
        return number1 * number2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number1 = scanner.nextDouble();
        double number2 = scanner.nextDouble();
        System.out.println(calculateProductOfTwoInputtedNumbers(number1, number2));
    }
}
