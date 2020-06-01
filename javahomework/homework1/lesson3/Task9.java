package javahomework.homework1.lesson3;

//    Display the cube of the number upto given integer.

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        for (int i = 1; i <= number; i++) {
            System.out.println("Number is : " + i + " and cube of the " + i + " is : " + (int) Math.pow(i, 3));
        }
    }
}
