import java.util.Arrays;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        
        // *******************forEach*******************
        List<String> usernames = Arrays.asList("blueEyedDreamer", "FiercePhoenix", "Wildflower87", "SerendipitousSurprise");
        usernames.stream()
            .map(name -> name.toUpperCase())
            .forEach(name -> System.out.println(name));
        

        // *******************toList*******************
        // FOR SOME ODD REASON THIS ONE DIDN'T WORK OUT FOR ME AND I COULDN'T FIGURE IT OUT QUICKLY
        // List<String> upperUsernames = usernames.stream()
        //     .map(name -> name.toUpperCase())
        //     .toList();


        // *******************reduce*******************

        List<Double> earnings = Arrays.asList(40.50, 60.00, 120.50, 20.00, 50.50, 20.00);
        Double totalEarnings = earnings.stream().reduce(0.00, (x, y) -> (x + y));
        
        System.out.println("\nYou have earned $" + totalEarnings);


        // *******************reduce*******************

        List<Double> expenses = Arrays.asList(2.50, 4.00, 5.50, 2.00, 5.50, 2.00);
        Double fundsRemaining = expenses.stream().reduce(100.00, (x, y) -> (x - y));
        
        System.out.println("\nYou still have $" + fundsRemaining);
       
       
        // *******************findFirst*******************
        List<String> aisles = Arrays.asList("apples", "bananas", "candy", "chocolate", "coffee", "tea");
        System.out.print("\nDo you guys sell coffee? ");
        
        String result = aisles.stream()
            .filter(item -> item.equals("dogs"))
            .findFirst()
            .orElse(null);
            
        String response = result == null ? "I'm sorry, no we don't!" : "We sure do!";

        System.out.println(response);
        
        
        // *******************count*******************        
        List<Integer> numbers = Arrays.asList(1, 1, 1, 2, 2, 1, 1, 2, 2, 2, 2, 3, 4, 1);
        int target = 2;
        System.out.println("\nHow many times does the number " + target + " repeat?");
        long count = numbers.stream().filter(number -> number == target).count();

        System.out.println("The number " + target + " repeats " + count + " times");
        
    }   
    
}
