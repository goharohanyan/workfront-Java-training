package javahomework.homework1.lesson3;

//    Determine whether a given number is prime or not.

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        boolean isPrime = true;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number : ");
        int number = scanner.nextInt();
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        if(isPrime) {
            System.out.println(number + " is a prime number");
        } else {
            System.out.println(number + " is not a prime number");
        };
    }
}
