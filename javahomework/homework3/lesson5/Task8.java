package javahomework.homework3.lesson5;

//    Get the password from console and write a function to check whether a string is a valid password or not.

import java.util.Scanner;

public class Task8 {

    public static boolean isPasswordValidOrNot(String password) {
        boolean isValid = false;
        if (password.length() >= 10) {
            int digitCount = 0;
            for (int i = 0; i < password.length(); i++) {
                char character = password.charAt(i);
                if (isDigit(character)){
                    digitCount++;
                } else if (!isLetter(character) && !isDigit(character)){
                    isValid = false;
                    return isValid;
                }
            }
            if(digitCount == 2){
                isValid = true;
            }

        }
        return isValid;
    }

    public static boolean isLetter(char letter) {
        if (((int) letter >= 65 && (int) letter <= 90) || ((int) letter >= 97 && (int) letter <= 122)) {
            return true;
        }
        return false;
    }

    public static boolean isDigit(char digit) {
        if ((int) digit >= 48 && (int) digit <= 57) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the password :  ");
        String password = scanner.nextLine();
        System.out.print("Entered password is valid :  ");
        System.out.println(isPasswordValidOrNot(password));
    }
}
