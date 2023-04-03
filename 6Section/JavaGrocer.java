import java.util.Scanner;

public class JavaGrocer {
    
    public static void main(String[] args) {
        String[] aisles = {"apples", "bananas", "candy", "chocolate", "coffee", "tea"};
        System.out.println("\nWhat can I help you find?");
        
        Scanner scan = new Scanner(System.in);
        
        String item = scan.nextLine();
        
        for (int i = 0; i < aisles.length; i++) {
            if (aisles[i].equals(item)) {
                System.out.println("\nWe have that in aisle: " + i + ".");
            }
        }
        
        scan.close();
    }
    
}