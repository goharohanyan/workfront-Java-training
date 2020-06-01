package javahomework.homework3.lesson5;

//    Get radius from console, write a function to calculate the area and the perimeter of the circle.

import java.util.Scanner;

public class Task9 {

    public static double perimeterOfCircle(double radius){
        return 2 * Math.PI * radius;
    }

    public static double areaOfCircle(double radius){
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius :  ");
        double radius = scanner.nextDouble();
        System.out.print("Perimeter of circle is : ");
        System.out.println(perimeterOfCircle(radius));
        System.out.print("Area of circle is : ");
        System.out.println(areaOfCircle(radius));
    }
}
