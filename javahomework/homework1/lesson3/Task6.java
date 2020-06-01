package javahomework.homework1.lesson3;

//    Find the sum of odd numbers of the first 100 natural numbers.
//    Using loop for adding numbers.

public class Task6 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i < 100; i++) {
            if (i % 2 == 1){
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
