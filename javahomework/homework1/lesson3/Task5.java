package javahomework.homework1.lesson3;

/*    Find the sum of the first 100 natural numbers.
 *    Using Gauss formula for adding numbers.
 *    s = 1 + 2 + 3 + 4 + 5
 *    s = 5 + 4 + 3 + 2 + 1
 *   -----------------------
 *   2s = 6 + 6 + 6 + 6 + 6
 *    s = 6 * 5 / 2
 */

public class Task5 {
    public static void main(String[] args) {
        int start = 1;
        int end = 100;
        int sum = (start + end) * 100 / 2;
        System.out.println(sum);
    }
}
