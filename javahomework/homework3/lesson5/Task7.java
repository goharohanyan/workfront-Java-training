package javahomework.homework3.lesson5;

//    Get the year from console (int) and write a function to check whether a year entered by the user is a leap year or not.Print the result.

import java.util.Scanner;

public class Task7 {

    public static void leapOrNot(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year : ");
        int year = scanner.nextInt();
        if (year % 4 == 0){
            System.out.println("Year " + year + " is a leap year." );
        } else {
            System.out.println("Year " + year + " is not a leap year." );
        }
    }

    public static void main(String[] args) {
        leapOrNot();
    }
}
