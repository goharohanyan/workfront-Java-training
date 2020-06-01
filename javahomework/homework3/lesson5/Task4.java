package javahomework.homework3.lesson5;

//    Get 3 numbers from console and write a function to find the smallest number among three numbers.
//    Print the smallest number

import java.util.Scanner;

public class Task4 {

    public static int findSmallestNumber(int number1, int number2, int number3) {
        return Math.min(Math.min(number1, number2), number3);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();
        System.out.println(findSmallestNumber(number1, number2, number3));
    }
}
