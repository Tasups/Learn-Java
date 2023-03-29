public class WeatherNetwork {
    public static void main(String[] args) {

        //See Learn the Part for the complete instructions (link in resources folder of Udemy video).  
        
        int temp = -1;  
        String forecast = "";

        if (temp <= -1) {
            forecast = "FREEZING";
        } else if (temp <= 10) {
            forecast = "chilly";
        } else {
            forecast = "warm";
        }
        
        System.out.println(forecast);
        
        if (forecast.equals("FREEZING")) {
            System.out.println("The forecast is " + forecast + "! Stay home!");
        } else if (forecast.equals("chilly")) {
            System.out.println("The forecast is " + forecast + ". Wear a coat.");
        } else if (forecast.equals("warm")) {
            System.out.println("The forecast is " + forecast + ". Go and play outside!");
        }
    }
}
