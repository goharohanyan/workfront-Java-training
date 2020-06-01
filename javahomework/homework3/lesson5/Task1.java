package javahomework.homework3.lesson5;

//    Generate 2 random numers and write a function to calculate their sum.Print the sum.

import java.util.Random;

public class Task1 {

    public static int calculateSumOfTwoRandomNumbers(int number1, int number2) {
        return number1 + number2;
    }

    public static void main(String[] args) {
        Random random = new Random();
        int number1 = random.nextInt();
        int number2 = random.nextInt();
        System.out.println(number1);
        System.out.println(number2);
        System.out.println(calculateSumOfTwoRandomNumbers(number1, number2));
    }
}
