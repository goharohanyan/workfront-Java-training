package javahomework.homework3.lesson6;

//    methods
//      - convertFarenheitToCelsius
//      - convertFarenheitToKelvin
//      - convertCelsiusToFarenheit
//      - convertCelsiusToKelvin
//      - convertKelvinToFarenheit
//      - convertKelvinToCelsius

public class TemperatureConverter {

    public static double convertFarenheitToCelsius(double farenheit){
        return (farenheit - 32) * 5 / 9;
    }

    public static double convertFarenheitToKelvin(double farenheit){
        return (farenheit - 32) * 5 / 9 + 273.15;
    }

    public static double convertCelsiusToFarenheit(double celsius){
        return celsius * 9 / 5 + 32;
    }

    public static double convertCelsiusToKelvin(double celsius){
        return celsius + 273.15;
    }

    public static double convertKelvinToFarenheit(double kelvin){
        return 9 * kelvin / 5 - 459.67;
    }

    public static double convertKelvinToCelsius(double kelvin){
        return kelvin - 273.15;
    }

    public static void main(String[] args) {
        System.out.println(TemperatureConverter.convertCelsiusToFarenheit(0));
        System.out.println(TemperatureConverter.convertCelsiusToKelvin(0));
        System.out.println(TemperatureConverter.convertKelvinToFarenheit(273.15));
        System.out.println(TemperatureConverter.convertKelvinToCelsius(305.15));
        System.out.println(TemperatureConverter.convertFarenheitToCelsius(32));
        System.out.println(TemperatureConverter.convertFarenheitToKelvin(32));
    }
}
