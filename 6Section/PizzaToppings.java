import java.util.Scanner;

public class PizzaToppings {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
    
        System.out.println("How many toppings do you want?");
        int numOfToppings = scan.nextInt();
        // to skip the nextLine trap
        scan.nextLine();
        
        String[] toppings = new String[numOfToppings];
        
        System.out.println("Please enter each topping: ");
        for (int i = 0; i < numOfToppings; i++) {
            System.out.print(i + ". ");
            toppings[i] = scan.nextLine();
        }
        
        scan.close();
        
        System.out.println("Thank you! Here are the toppings you ordered:");
        
        for (int j = 0; j < numOfToppings; j++) {
            System.out.println(j + ". " + toppings[j]);
        }
        
    }
    
}