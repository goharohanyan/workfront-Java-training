package javahomework.homework2;

//    Initialize array with random ints in range 10 - 99 of length 10, print it.
//    Get a number from console and check if an array contains that number.

import java.util.Random;
import java.util.Scanner;

public class Task1 {

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

    public static boolean isContain(int[] array, int verifiableNumber) {
        int i = 0;
        while (i < array.length){
            if (array[i] == verifiableNumber){
                return true;
            }
            i++;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] array = initializeArray(10);
        System.out.println("Initialized array : ");
        printArray(array);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check : ");
        int verifiableNumber = scanner.nextInt();
        boolean check = isContain(array,verifiableNumber);
        System.out.println("Array contains " + verifiableNumber + " : " + check);
    }
}
