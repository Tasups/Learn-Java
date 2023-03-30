public class Weather {
    public static void main(String[] args) {
        double noonF = 77;          //temperature at noon in fahrenheit.
        double eveningF = 61;       //temperature during the evening in fahrenheit
        double midnightF = 55;      //temperature at midnight in fahrenheit

        //Task 3 - Call the printTemperatures function. 
        
        double noonC = fahrenheitToCelsius(noonF);
        double eveningC = fahrenheitToCelsius(eveningF);
        double midnightC = fahrenheitToCelsius(midnightF);
        
        printTemperature("Noon", noonF, noonC);
        printTemperature("Evening", eveningF, eveningC);
        printTemperature("Midgnight", midnightF, midnightC);
    }

    //Task 1: Make a function here. See the doc comments below. 

    /**
     * Function name: fahrenheitToCelsius - converts fahrenheit to celcius
     * @param fahrenheit (double)
     * @return celsius (double)
     * 
     * Inside the function:
     * 1. returns the temperature in celcius. C = (F - 32) * 5/9. 
     */
     
     public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (fahrenheit - 32) * 5/9;
        return celsius;
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
     
     public static void printTemperature(String label, double fahrenheit, double celsius) {
         System.out.println(label + " temperature is: " + fahrenheit + " degrees Fahrenheit or " + celsius + " degrees Celsius.");
     }
}