package javahomework.homework3.lesson6;

//    properties
//      - coordinateX
//      - coordinateY
//    methods
//      - distance()  (from 0:0 coordinat)
//      - distance(Point point) ( Overloaded method to get the distance between 2 points )

public class Point {
    private int coordinateX;
    private int coordinateY;

    //region Getter, Setter
    public int getCoordinateX() {
        return coordinateX;
    }

    public void setCoordinateX(int coordinateX) {
        this.coordinateX = coordinateX;
    }

    public int getCoordinateY() {
        return coordinateY;
    }

    public void setCoordinateY(int coordinateY) {
        this.coordinateY = coordinateY;
    }
    // endregion
    public Point(){

    }

    public Point(int coordinateX, int coordinateY){
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
    }

    public double distance(){
        return Math.sqrt(coordinateX * coordinateX + coordinateY * coordinateY);
    }

    public double distance(Point point){
        int subtractionX = coordinateX - point.coordinateX;
        int subtractionY = coordinateY - point.coordinateY;
        return Math.sqrt(subtractionX * subtractionX + subtractionY * subtractionY);
    }

    public static void main(String[] args) {
        Point poin = new Point(3, 4);
        System.out.println(poin.distance());
        System.out.println(poin.distance(new Point(0,1)));
    }
}
