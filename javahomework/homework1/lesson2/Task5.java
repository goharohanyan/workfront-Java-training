package javahomework.homework1.lesson2;

//    Generate 2 random ints, input an operator and perform calculation based on operator. Print the result.

import java.util.Random;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Random random = new Random();
        int number1 = random.nextInt();
        System.out.println("First number is : " + number1);
        int number2 = random.nextInt();
        System.out.println("Second number is : " + number2);

        Scanner scanner = new Scanner(System.in);
        String operator = scanner.nextLine();
        int result = 0;
        switch (operator){
            case "+" :
                result = number1 + number2;
                break;
            case "-" :
                result = number1 - number2;
                break;
            case "*" :
                result = number1 * number2;
                break;
            case "/" :
                result = number1 / number2;
                break;
        }
        System.out.println(result);

    }
}