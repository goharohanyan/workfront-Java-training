package javahomework.homework3.lesson6;

//  methods
//      - convertMetersToMiles
//      - convertMilesToMeters

public class DistanceConverter {

    public static double convertMetersToMiles(double meters){
        return meters / 1609.344;
    }

    public static double convertMilesToMeters(double miles){
        return miles * 1609.344;
    }

    public static void main(String[] args) {
        System.out.println(DistanceConverter.convertMetersToMiles(100000));
        System.out.println(DistanceConverter.convertMilesToMeters(60));
    }
}
