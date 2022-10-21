public class Temperature {
    public static double celsiusToFahrenheit(double ctemp) {
        double ftemp = (ctemp*9/5)+32;
        return ftemp;
    }
    public static double fahrenheitToCelsius(double ftemp) {
        double ctemp = (ftemp-32)*5/9;
        return ctemp;
    }
    public static void main(String[] args) {
        double temp = 30;
        System.out.println("Celsius: " + fahrenheitToCelsius(temp));
        System.out.println("Fahrenheit: " + celsiusToFahrenheit(temp));
    }
}
