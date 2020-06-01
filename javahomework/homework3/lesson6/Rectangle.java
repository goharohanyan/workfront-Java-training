package javahomework.homework3.lesson6;

//  properties
//  	- height
//	    - width
//
//  methods
//	    - calculatePerimeter
//  	- calculateArea

public class Rectangle {
    private int width;
    private int height;

    // region Getter,Setter
    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    // endregion

    public Rectangle() {

    }

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int calculatePerimeter() {
        return 2 * (width + height);
    }

    public int calculateArea() {
        return width * height;
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle(4,5);
        System.out.println("Perimeter is : " + r.calculatePerimeter());
        System.out.println("Area is : " + r.calculateArea());

    }
}
