package javahomework.homework1.lesson1;

//    Take three numbers from the user and print the greatest number.

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input 1st number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Input 2nd number: ");
        int secondNumber = scanner.nextInt();
        System.out.println("Input 3rd number: ");
        int thirdNumber = scanner.nextInt();

        System.out.println("The greatest: " + Math.max(firstNumber, Math.max(secondNumber, thirdNumber)));
    }
}
