import java.util.Arrays;

public class WeatherArrays {
    public static void main(String[] args) {
        double[] celsius = {12.5, 14.5, 17.0, 21.0, 23.0, 18.5, 20.0};
        double[] fahrenheit= celciusToFahrenheit(celsius);
       // System.out.println(c);
        printTemperatures(celsius, "Celsius");
        printTemperatures(fahrenheit, "fahrenheit");
    }

    public static double[] celciusToFahrenheit(double[] celsius){
        double[] fahrenheit = new double[celsius.length];
        for(int i=0; i< celsius.length; i++){
            fahrenheit[i] = (((celsius[i]/5) * 9) + 32);
        }
        System.out.println(Arrays.toString(fahrenheit));
        return fahrenheit;
    }
    public static void printTemperatures(double[] temp, String value){
        System.out.print(value + ": ");
        for (int i = 0; i < temp.length; i++) {
            System.out.print(temp[i] + " ");
        }
        System.out.println("\n");
    }

}