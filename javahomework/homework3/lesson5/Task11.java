package javahomework.homework3.lesson5;

//    Create int array [10]. Write a function that takes as a parameter array and initializes that array with random numbers.
//    Write a function that takes as a parameter array and prints it. Call them in main.

import java.util.Random;

public class Task11 {

    public static int[] initializeArrayWithRandomNumbers(int[] array){
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(250);
        }
        return array;
    }

    public static void printArray(int[] array){
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println(array[array.length - 1]);
    }

    public static int[] allocateEmptyArray(int size){
        return new int[size];
    }

    public static void main(String[] args) {
        int[] array = allocateEmptyArray(10);
        System.out.print("Initialized array : ");
        printArray(initializeArrayWithRandomNumbers(array));

    }
}
