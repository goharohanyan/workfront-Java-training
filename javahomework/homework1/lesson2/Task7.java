package javahomework.homework1.lesson2;

import java.util.Scanner;

//    Print the number of days for inputted month.

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input month name :");
        String monthName = scanner.nextLine();
        int monthDays = 0;

        switch (monthName){
            case "January" :
            case "March" :
            case "May" :
            case "July" :
            case "August" :
            case "October" :
            case "December" :
                monthDays = 31;
                break;
            case "April" :
            case "June" :
            case "September" :
            case "November" :
                monthDays = 30;
                break;
            case "February" :
                System.out.println("In which year? ");
                int year = scanner.nextInt();
                if (year % 4 != 0) {
                    monthDays = 28;
                } else {
                    monthDays = 29;
                }
                break;
        }
        System.out.println(monthName + " have " + monthDays + " days.");

    }
}
