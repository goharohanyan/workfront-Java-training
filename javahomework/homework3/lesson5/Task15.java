package javahomework.homework3.lesson5;

//    Initialize an array [10] with random numbers. Write a function that takes as an argument an array and returns the reversed array

public class Task15 {

    public static int[] reverseArray(int[] array){
        for (int i = 0; i < array.length / 2; i++) {
            int template = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = template;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = Task11.allocateEmptyArray(10);
        Task11.initializeArrayWithRandomNumbers(array);
        System.out.print("Initialized array : ");
        Task11.printArray(array);
        System.out.print("Reversed array : ");
        Task11.printArray(reverseArray(array));
    }
}
