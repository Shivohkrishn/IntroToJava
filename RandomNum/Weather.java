public class Weather {
    public static void main(String[] args) {
        double noon = 77;          //temperature at noon in fahrenheit.
        double evening = 61;       //temperature during the evening in fahrenheit
        double midnight = 55;      //temperature at midnight in fahrenheit

        /**
         *
         *
         *
         * */
        //Task 3 - Call the printTemperatures function.
        double Temp1 = fahrenheitToCelsius(noon);
        double Temp2 = fahrenheitToCelsius(evening);
        double Temp3 = fahrenheitToCelsius(midnight);
        printTemperatures(noon,Temp1);
        printTemperatures(evening,Temp2);
        printTemperatures(midnight,Temp3);

    }

    //Task 1: Make a function here. See the doc comments below.

    /**
     *
     * @param fahrenheit
     * @return
     */

    public static double fahrenheitToCelsius(double fahrenheit){
        double C = (fahrenheit - 32) * 5/9;
        return C;
    }
    //Task 2: Make a function here. See the doc comments below.

    /**
     * Function name: printTemperatures – prints both temperature values.
     * @param fahrenheit (double)
     *
     * Inside the function:
     *  1. prints: F: <temperature in fahrenheit>.
     *  2. prints: C: <temperature in celsius> .
     */
    public static void printTemperatures(double fahrenheit, double C){
        System.out.println("temperature in fahrenheit"+fahrenheit+" temperature in celsius"+C);
    }
}

