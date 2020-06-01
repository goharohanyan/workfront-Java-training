package javahomework.homework1.lesson3;

//     Find the average of even numbers of the first 100 natural numbers.
//     Using loop.

public class Task7 {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;
        int average = 0;
        for (int i = 1; i < 100; i++) {
            if (i % 2 == 0) {
                sum += i;
                count++;
            }
        }
        average = sum / count;
        System.out.println(average);
    }
}
