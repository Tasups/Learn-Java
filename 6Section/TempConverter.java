import java.util.Arrays;

public class TempConverter {
    
    public static void main(String[] args) {
        double[] celsius = {12.5, 14.5, 17.0, 21.0, 23.0, 18.5, 20.0};
        // double[] fahrenheit = celsiusToFahrenheit(celsius);
        
        double[] fahrenheit = Arrays.copyOf(celsius, celsius.length);
        for (int i = 0; i < fahrenheit.length; i++) {
            fahrenheit[i] = (fahrenheit[i] / 5) * 9 + 32;
        }
        
        System.out.println(Arrays.toString(fahrenheit));
    }
    
    // public static double celsiusToFahrenheit(double[] celsius){
    //     //double[] fahrenheit = new double[celsius.length];
        
    //     // String[] skills = {"JavaScript", "XHTML", "CSS3", "Python", "Java"};
    //     // String[] newSkills = Arrays.copyOf(skills, skills.length);
        
    //     double[] fahrenheit = Arrays.copyOf(celsius, celsius.length);
        
    //     for (int i = 0; i < fahrenheit.length; i++) {
    //         fahrenheit[i] = (fahrenheit[i] / 5) * 9 + 32;
    //     }
    //     return fahrenheit[];
    // }
    
}