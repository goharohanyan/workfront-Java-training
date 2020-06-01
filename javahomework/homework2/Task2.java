package javahomework.homework2;

//    Initialize array with random ints in range 10 - 99 of length 10, print it.
//    Sort it in ascending order, print the sorted array.

import java.util.Random;

public class Task2 {

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

    public static int[] sortInAscendingOrder(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int template = array[i];
                    array[i] = array[j];
                    array[j] = template;
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = initializeArray(10);
        System.out.println("Initialized array");
        printArray(array);
        System.out.println("Sorted in ascending order");
        printArray(sortInAscendingOrder(array));
    }
}
