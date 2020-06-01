package javahomework.homework1.lesson1;

//    Write a program to convert temperature from Fahrenheit to Celsius degree.

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input a degree in Fahrenheit: ");
        double fDegree = scanner.nextDouble();
        double cDegree = (fDegree - 32) * 5 / 9;

        System.out.println(fDegree + " degree Fahrenheit is equal to " + cDegree + " in Celsius");

    }
}
