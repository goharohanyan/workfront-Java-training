package javahomework.homework3.lesson5;

//    Get a sentence from console and write a function to count all words in a string.Print count;

import java.util.Scanner;

public class Task6 {

    public static int wordCounter(String string) {
        int count = 0;
        string = string.trim();
        boolean isCounted = false;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == ' ') {
                if (!isCounted) {
                    count++;
                    isCounted = true;
                }
            } else if (isCounted){
                isCounted = false;
            }
        }
        return ++count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        System.out.println(wordCounter(string));
    }
}
