package javahomework.homework3.lesson6;

//	    properties
//	        - radius
//    	methods
//	        - calculatePerimeter
//	        - calculateArea


public class Circle {
    private int radius;

    //region Getter, Setter
    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }
    //endregion

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setRadius(5);
        System.out.println("Perimeter is : " + circle.calculatePerimeter());
        System.out.println("Area is : " + circle.calculateArea());
    }
}
