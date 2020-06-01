package javahomework.homework3.lesson5;

//    Initialize an array [10] with random numbers. Write a function that takes as an argument an array and
//    returns the array sorted in ascending order.

public class Task12 {

    public static int[] sortArrayInAscendingOrder(int[] array){
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[i]){
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
        System.out.print("Sorted in ascending order : ");
        Task11.printArray(sortArrayInAscendingOrder(array));
    }
}
