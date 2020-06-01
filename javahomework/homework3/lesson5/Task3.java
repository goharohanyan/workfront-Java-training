package javahomework.homework3.lesson5;

//    Get 2 numers from console, write a function to calculate their product and a cube of the product.
//    Print the cube of the product.

import java.util.Scanner;

public class Task3 {

    public static double cubeOfTheProductOfTwoInputtedNumbers(double number1, double number2){
        double product = Task2.calculateProductOfTwoInputtedNumbers(number1, number2);
        return  Math.pow(product, 3);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number1 = scanner.nextDouble();
        double number2 = scanner.nextDouble();
        System.out.println(cubeOfTheProductOfTwoInputtedNumbers(number1, number2));
    }
}
