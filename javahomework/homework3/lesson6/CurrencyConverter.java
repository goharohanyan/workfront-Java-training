package javahomework.homework3.lesson6;
//    methods
    //    - convertDollarToEuro
//        - convertDollarToDram
//        - convertDollarToRuble
//        - convertEuroToDollar
//        - convertEuroToDram
//        - convertEuroToRuble
//        - convertDramToDollar
//        - convertDramToEuro
//        - convertDramToRuble
//        - convertRubleToDollar
//        - convertRubleToEuro
//        - convertRubleToRuble

public class CurrencyConverter {  // as of Tuesday morning։)

    public static double convertDollarToEuro(double dollars){
        return dollars * 0.898157878;
    }

    public static double convertDollarToDram(double dollars){
        return dollars * 484.321;
    }

    public static double convertDollarToRuble(double dollars){
        return dollars * 70.2247191;
    }

    public static double convertEuroToDollars(double euros){
        return euros * 1.11341;
    }

    public static double convertEuroToDram(double euros){
        return euros * 539.219;
    }

    public static double convertEuroToRuble(double euros){
        return euros * 78.0802;
    }

    public static double convertDramToEuro(double drams){
        return drams * 0.00185366;
    }

    public static double convertDramToDollar(double drams){
        return drams * 0.00206474;
    }

    public static double convertDramToRuble(double drams){
        return drams * 0.144774;
    }

    public static double convertRubleToEuro(double rubles){
        return rubles * 0.0128687;
    }

    public static double convertRubleToDollar(double rubles){
        return rubles * 0.0143332;
    }

    public static double convertRubleToDram(double rubles){
        return rubles * 6.94134;
    }

    public static void main(String[] args) {
        System.out.println(CurrencyConverter.convertDollarToDram(700));
        System.out.println(CurrencyConverter.convertEuroToDram(700));
        System.out.println(CurrencyConverter.convertRubleToDram(10000));
        System.out.println(CurrencyConverter.convertDramToDollar(1000000));
        System.out.println(CurrencyConverter.convertDramToEuro(1000000));
        System.out.println(CurrencyConverter.convertDramToRuble(1000000));
    }
}
