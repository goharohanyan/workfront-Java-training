package javahomework.homework1.lesson1;

//    Print the area and perimeter of a circle with given radius.

public class Task6 {
    public static void main(String[] args) {
        double radius = 7.5;
        double perimeter = 2 * radius * Math.PI;
        double area = Math.PI * radius * radius;

        System.out.println("Perimeter is " + perimeter);
        System.out.println("Area is " + area);


    }
}
