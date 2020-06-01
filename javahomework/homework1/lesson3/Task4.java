package javahomework.homework1.lesson3;

//    Print the odd numbers in range  {-60,  -20}.
public class Task4 {
    public static void main(String[] args) {
        int lower = -60;
        int upper = -20;
        System.out.print("Odd numbers in range {-60, -20} : ");
        for (int i = lower; i < upper; i++) {
            if (i % 2 != 0){
                System.out.print(i + ", ");
            }
        }
    }
}
