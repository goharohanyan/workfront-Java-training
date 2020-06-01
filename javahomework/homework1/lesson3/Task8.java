package javahomework.homework1.lesson3;

import javax.swing.*;
import java.util.Scanner;

//     Read 10 numbers from keyboard and find their sum and average.

public class Task8 {
    public static void main(String[] args) {
        double sum = 0;
        double average = 0;
        Scanner keyboard = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            double number = keyboard.nextDouble();
            sum += number;
        }
        average = sum / 10;
        System.out.println(sum);
        System.out.println(average);
    }
}
