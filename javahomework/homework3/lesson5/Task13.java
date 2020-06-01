package javahomework.homework3.lesson5;

//    Initialize an array [10] with random numbers. Write a function that takes as an argument an array and
//    returns the array sorted in descending order.

public class Task13 {

    public static int[] sortArrayInDescendingOrder(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] < array[j]) {
                    int template = array[i];
                    array[i] = array[j];
                    array[j] = template;
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = Task11.allocateEmptyArray(10);
        Task11.initializeArrayWithRandomNumbers(array);
        System.out.print("Initialized array : ");
        Task11.printArray(array);
        System.out.print("Sorted in descending order : ");
        Task11.printArray(sortArrayInDescendingOrder(array));
    }


}
