package javahomework.homework1.lesson3;

//    Display the first 20 natural numbers but exclude the ones that are divisible by 3.

public class Task2 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i < 40; i++) {
            if (count == 20){
                break;
            }
            if (i % 3 == 0){
                continue;
            }
            System.out.print(i + " ");
            count++;
        }
    }
}
