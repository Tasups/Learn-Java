public class SwitchStatements {
    public static void main(String[] args) {

        // Section 1: Weather conditions
        String weather = "tornado";
        switch (weather) {
            case "sunny":   System.out.println("You can wear a shirt."); break;
            case "cloudy":  System.out.println("You should probably wear a sweater."); break;
            case "rainy":   System.out.println("You should wear a raincoat."); break;
            case "snowy":   System.out.println("You should wear warm layers."); break;
            default:        System.out.println("You can wear what you want."); 
        }
        // Determine what to wear based on the weather (e.g., sunny, cloudy, rainy, snowy)
        // Decide whether to use if-else or switch

        // Section 2: User role
        int role = 3;
        switch (role) {
            case 1:     System.out.println("Admin"); break;
            case 2:     System.out.println("Editor"); break;
            case 3:     System.out.println("User"); break;
            default:    System.out.println("Please sign in."); 
        }
        // Determine user access level based on the role (e.g., 1: admin, 2: editor, 3: user)
        // Decide whether to use if-else or switch

        // Section 3: Temperature and humidity
        // NEED TO DO MORE WORK ON THIS ONE, BUT I'M MOVING ON BECAUSE IT'S MORE WORK THAN IT'S LIKELY WORTH
        int temperature = 75;
        int humidity = 65;
        if (humidity < 50 && temperature <= 80 || temperature >= 60) {
            System.out.println("The weather is comfortable");
        } else if (temperature > 80) {
            System.out.println("It's too hot.");
        } else if (humidity > 50 && temperature > 80) {
            System.out.println("It's too hot and humid!");
        } else {
            System.out.println("It's too cold.");
        }
        // Determine the comfort level based on both temperature and humidity (e.g., too hot, too cold, comfortable)
        // Decide whether to use if-else or switch

        // Section 5: Age and income
        int age = 25;
        int income = 20_000;
        if (age >= 18 && income >= 35_000) {
            System.out.println("You are eligible for a credit card.");
        } else {
            System.out.println("You are NOT eligible for a credit card.");
        }
        // Determine eligibility for a specific credit card based on age and income
        // Decide whether to use if-else or switch

        // Section 1: Traffic light colors
        String lightColor = "yellow";
        switch (lightColor) {
            case "green":   System.out.println("Go"); break;
            case "yellow":  System.out.println("Go Fast!"); break;
            case "red":     System.out.println("Stop"); break;
            default:        System.out.println("Are you even at a stop light?"); 
        }
        // Determine what action to take based on the traffic light color (e.g., green, yellow, red)
        // Decide whether to use if-else or switch

        // Section 2: Exam grade
        int grade = 90;
        if (grade >= 90) { System.out.println("A"); }
        else if (grade >= 80) { System.out.println("B"); }
        else if (grade >= 70) { System.out.println("C"); }
        else if (grade >= 60) { System.out.println("D"); }
        else { System.out.println("F");}
        // Determine the letter grade based on the numeric grade (e.g., A, B, C, D, F)
        // Decide whether to use if-else or switch

        // Section 3: Browser type
        String browser = "Firefox";
        switch (browser) {
            case "Chrome":  System.out.println("Ok. Good choice."); break;
            case "Firefox": System.out.println("It works. No problem."); break;
            case "Safari":  System.out.println("Makes sense."); break;
            case "Edge":    System.out.println("Go fucking die in a fire!"); break;
            case "Opera":   System.out.println("Whatever."); break;
            default:        System.out.println("Are you even on the internet?"); 
        }
        // Check if the browser is one of the following: Chrome, Firefox, Safari, Edge, or Opera
        // Decide whether to use if-else or switch
        
        

    }
}
