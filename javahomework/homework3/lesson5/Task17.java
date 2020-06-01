package javahomework.homework3.lesson5;

//    Write a function that takes as an argument int number and calculates its factorial.

public class Task17 {

    public static int factorial(int number){
        if (number == 0 || number == 1){
            return 1;
        }
        return number * factorial(number - 1);
    }

    public static void main(String[] args) {
        System.out.println("Factroial of 7 is : " + factorial(7));
        System.out.println("Factroial of 4 is : " + factorial(4));
    }
}
