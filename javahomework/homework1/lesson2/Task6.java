package javahomework.homework1.lesson2;

//    Write a program which prints week name using inputted week day.

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int weekDay = scanner.nextInt();
        String weekName = "";
        switch (weekDay) {
            case 1 :
                weekName = "Monday";
                break;
            case 2 :
                weekName = "Tuesday";
                break;
            case 3 :
                weekName = "Wednesday";
                break;
            case 4 :
                weekName = "Thursday";
                break;
            case 5 :
                weekName = "Friday";
                break;
            case 6 :
                weekName = "Saturday";
                break;
            case  7 :
                weekName = "Sunday";
                break;
            default:
                weekName = "Input valid week day!";
        }
        System.out.println(weekName);
    }
}
