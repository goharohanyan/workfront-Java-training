package javahomework.homework2;

//    Initialize array with random ints in range 10 - 99 of length 10, print it.
//    Get a number from console, find and print its index in array.

import java.util.Random;
import java.util.Scanner;

public class Task4 {

    public static int[] initializeArray(int length) {
        int[] initializedArray = new int[length];
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            initializedArray[i] = random.nextInt(90) + 10;
        }
        return initializedArray;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static int indexOf(int[] array, int verifiableNumber){
        for (int i = 0; i < array.length; i++) {
            if (array[i] == verifiableNumber){
                return i;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        int[] array = initializeArray(10);
        System.out.println("Initialized array : ");
        printArray(array);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an element : ");
        int verifiableNumber = scanner.nextInt();
        System.out.println("Index of " + verifiableNumber + " in an array is : " + indexOf(array, verifiableNumber));
    }
}
