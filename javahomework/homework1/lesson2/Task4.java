package javahomework.homework1.lesson2;

//    Get from the user an int number. In case number > 100, generate a random int in range 50 - number.
//    In case number < 100, generate a random int in range 0 - 50. Cast the random number to String and print.

import java.util.Random;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        int limit = 50;
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();

        Random random = new Random();
        int randomNumber = 0;

        if (inputNumber > 100) {
            randomNumber = random.nextInt(inputNumber - limit + 1) + limit;
        } else if (inputNumber < 100) {
            randomNumber = random.nextInt(limit);
        }
        System.out.println(String.valueOf(randomNumber));
    }
}
