package javahomework.homework3.lesson5;

//    Get sides of the triangle, write a function to check if the triangle with that sides is valid.
//    Write a function to calculate the perimeter and the area of the triangle. If triangle is valid calculate perimeter and area.

import java.util.Scanner;

public class Task10 {

    public static boolean isTriangleValid(double side1, double side2, double side3){
        boolean isValid = false;
        if (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1){
            isValid = true;
        }
        return isValid;
    }

    public static double perimeterOfTriangle(double side1, double side2, double side3){
        return side1 + side2 + side3;
    }

    public static double areaOfTriangle(double side1, double side2, double side3){
        double p = (side1 + side2 + side3) / 2;
        return Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double side1 = scanner.nextDouble();
        double side2 = scanner.nextDouble();
        double side3 = scanner.nextDouble();
        if (isTriangleValid(side1, side2, side3)) {
            System.out.println(perimeterOfTriangle(side1, side2, side3));
            System.out.println(areaOfTriangle(side1, side2, side3));
        } else{
            System.out.println("Triangle is not valid triangle!");
        }

    }
}
