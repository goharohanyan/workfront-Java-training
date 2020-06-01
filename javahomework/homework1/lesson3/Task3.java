package javahomework.homework1.lesson3;

//    Print the even numbers in range  {-20,  +60}.

public class Task3 {
    public static void main(String[] args) {
        int lower = -20;
        int upper = 60;
        System.out.print(("Even numbers in range  {-20,  +60}: "));
        for (int i = lower; i <= upper; i++) {
            if (i % 2 == 0) {
                System.out.print(i + ", ");
            }
        }
    }
}
