package javahomework.homework1.lesson2;

//    Generate a random int number in range 10 - 100, calculate the square of it.
//    Cast the result to String end print the result.

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int lower = 10;
        int upper = 100;
        Random random = new Random();

        int randomNumber = random.nextInt(upper - lower + 1) + lower;
        System.out.println("Random number is : " + randomNumber);
        int square = (int) Math.pow(randomNumber,2);

        System.out.println(String.valueOf(square));
    }
}
