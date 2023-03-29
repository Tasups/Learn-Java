import java.util.Scanner;

public class Dealership {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(" - Welcome to the Java Dealership");
        System.out.println(" - Select option 'a' to buy a car");
        System.out.println(" - Select option 'b' to sell a car");
        String option = scan.nextLine();

        /******************Part 1******************/
        
        switch (option) {
            
            /******************Case A******************/
            
            case "a": System.out.println("you chose option " + option);
                
                System.out.println("\nWhat is your budget?");
                double budget = scan.nextDouble();
                scan.nextLine();
                
                if (budget >= 10000) {
                    System.out.println("Great! A Nissan Altima is available");
                    System.out.println("\nDo you have insurance? Write 'yes' or 'no'");
                    String insurance = scan.nextLine();
                    System.out.println("\nDo you have a license? Write 'yes' or 'no'");
                    String license = scan.nextLine();
                    System.out.println("What is your credit score?");
                    int creditScore = scan.nextInt();
                    if (insurance.equals("yes") && license.equals("yes") && creditScore >= 660) {
                        System.out.println("Sold! Pleasure doing business with you");
                    } else {
                        System.out.println("I'm sorry, we cannot sell you a car.");
                    }
                } else {
                    System.out.println("We're sorry. You are not eligible");
                }
                break;
                
            /******************Case B******************/
                
            case "b": System.out.println("you chose option " + option);
                System.out.println("What is your car valued at?");
                int value = scan.nextInt();
                System.out.println("What is your selling price?");
                int price = scan.nextInt();
                if (value > price && price <= 30_000) {
                     // value is greater than price and price is less than 30000
                    System.out.println("We will buy your car. Pleasure doing business with you!");
                } else {
                    //otherwise
                    System.out.println("Sorry, we're not interested.");
                }
                break;
                
            default: System.out.println("invalid option " + option);
        }
        
        scan.close();
    }
        
}
