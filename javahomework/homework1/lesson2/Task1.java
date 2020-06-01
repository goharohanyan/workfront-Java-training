package javahomework.homework1.lesson2;

//    Generate 2 random int numbers in range 10 - 100 calculate the sum, cast it to long and print.

import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        int lower = 10;
        int upper = 100;
        Random random = new Random();

        int number1 = random.nextInt(upper - lower + 1) + lower;
        int number2 = random.nextInt(upper - lower + 1) + lower;
        int sum = number1 + number2;
        System.out.println((long) sum);
    }
}
