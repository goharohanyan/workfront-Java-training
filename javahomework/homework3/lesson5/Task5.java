package javahomework.homework3.lesson5;

//    Get a string from console and write a function to display the middle character of a string.

import java.util.Scanner;

public class Task5 {

    public static char findMiddleCharacter(String string) {
        return (string.length() % 2) == 1 ? string.charAt(string.length() / 2) : string.charAt(string.length() / 2 - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputtedString = scanner.nextLine();
        System.out.println(findMiddleCharacter(inputtedString));
    }
}
