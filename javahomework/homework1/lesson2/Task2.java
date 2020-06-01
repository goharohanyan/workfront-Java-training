package javahomework.homework1.lesson2;

//    Generate 2 random int numbers in range 10 - 100, calculate the product.In case product is even cast it to long,
//    in case product is odd cast it to double. Print the product.

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int lower = 10;
        int upper = 100;
        Random random = new Random();

        int number1 = random.nextInt(upper - lower + 1) + lower;
        System.out.println("First number is : " + number1);
        int number2 = random.nextInt(upper - lower + 1) + lower;
        System.out.println("Second number is : " + number2);
        int product = number1 * number2;

        if (product % 2 == 0) {
            System.out.println(((long) product));
        } else {
            System.out.println((double) product);
        }
    }
}
