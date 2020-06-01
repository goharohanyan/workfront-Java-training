package javahomework.homework3.lesson5;

//    Write a method to print all prime numbers less than 100.

public class Task14 {

    public static boolean isNumberPrime(int number){
        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0){
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    public static void printAllPrimeNumbersUpTo(int upTo){
        for (int i = 1; i < upTo; i++) {
            if (isNumberPrime(i))
                System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        System.out.print("All prime numbers less than 100 : ");
        printAllPrimeNumbersUpTo(100);
    }
}
