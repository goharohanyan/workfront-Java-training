package javahomework.homework3.lesson6;

//    properties
//        - sideA
//        - sideB
//        - sideC
//    methods
//        - calculatePerimeter
//        - calculateArea

public class Triangle {
    private int sideA;
    private int sideB;
    private int sideC;

    // region Getter, Setter
    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }

    public int getSideC() {
        return sideC;
    }

    public void setSideC(int sideC) {
        this.sideC = sideC;
    }
    // endregion

    public Triangle() {
    }

    public Triangle(int sideA, int sideB, int sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public int calculatePerimeter(){
        return sideA + sideB + sideC;
    }

    public double calculateArea(){
        double p = (sideA + sideB + sideC) / 2;
        return Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
    }

    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle.setSideA(4);
        triangle.setSideB(13);
        triangle.setSideC(12);
        System.out.println("Perimeter is : " + triangle.calculatePerimeter());
        System.out.println("Area is : " + triangle.calculateArea());
    }
}
