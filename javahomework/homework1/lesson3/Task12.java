package javahomework.homework1.lesson3;

//    Display the first n Fibonacci series.

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input number : ");
        int n = keyboard.nextInt();
        int first = 0;
        int second = 1;
        if (n >= 1){
            System.out.print(first + " ");
        }
        if (n >= 2){
            System.out.print(second + " ");
        }
        for (int i = 3; i <= n; i++) {
            int third = first + second;
            System.out.print(third + " ");
            first = second;
            second = third;
        }

    }
}
